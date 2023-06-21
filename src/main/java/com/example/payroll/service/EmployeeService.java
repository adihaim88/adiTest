package com.example.payroll.service;


import com.example.payroll.repository.EmployeeRepository;
import com.example.payroll.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    EmployeeRepository repository;

    public List<Employee> All() {
        return repository.findAll();
    }

    public Employee save(Employee newEmployee) {
    return repository.save(newEmployee);
    }

    public Employee getById(Long id) {
        return repository.getById(id);
    }
}
