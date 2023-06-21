package com.example.payroll.controller;


import java.util.List;

import com.example.payroll.repository.EmployeeRepository;
import com.example.payroll.exception.*;

import com.example.payroll.model.Employee;
import com.example.payroll.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "Employee Managment", protocols = "http")
@RequestMapping(value = "/employee")
class EmployeeController {

    private final EmployeeRepository repository;
    private final EmployeeService employeeService;

    EmployeeController(EmployeeRepository repository, EmployeeService employeeService) {
        this.repository = repository;
        this.employeeService = employeeService;
    }



    @GetMapping("/employees/getAll")
    @ApiOperation(value = " access all Employee",response = Employee.class,code=200)
    ResponseEntity<List<Employee> >all() {
        return  new ResponseEntity<>(employeeService.All(), HttpStatus.OK);
    }


    @PostMapping("/employees/addEmployee")
    @ApiOperation(value = "save new employee",response = Employee.class,code=200)
    ResponseEntity<Employee>  newEmployee(@RequestBody Employee newEmployee) {
        return  new ResponseEntity<>(employeeService.save(newEmployee), HttpStatus.OK);
    }

    // Single item

//    @GetMapping("/employees/getEmployee/{id}")
//    @ApiOperation(value = "get employee with ID",response = Employee.class,code=200)
//    Employee one(@PathVariable Long id) {
//        return  new ResponseEntity<>(employeeService.getById(id), HttpStatus.OK);
//        return repository.getById(id);
//
//    }

//    @PutMapping("/employees/{id}")
//    Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {
//
//        return repository.findOne(id)
//                .(employee -> {
//                    employee.setName(newEmployee.getName());
//                    employee.setRole(newEmployee.getRole());
//                    return repository.save(employee);
//                })
//                .orElseGet(() -> {
//                    newEmployee.setId(id);
//                    return repository.save(newEmployee);
//                });
//    }

    @DeleteMapping("/employees/deleteByID/{id}")
    @ApiOperation(value = "Delete employee with ID",response = Employee.class,code=200)
    void deleteEmployee(@PathVariable Long id) {

        try {
            repository.deleteById(id);
        }
        catch (EmptyResultDataAccessException e){
            throw  new EmployeeNotFoundException(id);
        }
    }
}