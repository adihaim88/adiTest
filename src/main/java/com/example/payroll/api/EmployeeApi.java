//package com.example.payroll.api;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import io.swagger.annotations.*;
//
//import jdk.nashorn.internal.codegen.ApplySpecialization;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import javax.servlet.http.HttpServletRequest;
//import java.io.IOException;
//import java.util.Optional;
//
//@Api(value = "Employee", description = "the Employee API")
//@RequestMapping(value = "/Adi/Employee")
//public interface EmployeeApi {
//
//    Logger log = LoggerFactory.getLogger(EmployeeApi.class);
//
//
//    default Optional<ObjectMapper> getObjectMapper() {
//        return Optional.empty();
//    }
//
//    default Optional<HttpServletRequest> getRequest() {
//        return Optional.empty();
//    }
//
//    default Optional<String> getAcceptHeader() {
//        return getRequest().map(r -> r.getHeader("Accept"));
//    }
//
//
//    @ApiOperation(value = "Get Emplyee by Id", nickname = "getEmployee", notes = "", tags={ "Notification", })
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "OK"),
//            @ApiResponse(code = 401, message = "Unauthorized"),
//            @ApiResponse(code = 403, message = "Forbidden"),
//            @ApiResponse(code = 404, message = "The specified resource was not found"),
//            @ApiResponse(code = 500, message = "Internal server error")})
//    @RequestMapping(value = "/Adi/Employee/{EmployeeID}/}",
//            produces = { "application/json" },
//            method = RequestMethod.GET)
//    default void getNotification(@ApiParam(value = "Project key",required=true) @PathVariable("employeeID") String projectKey, @ApiParam(value = "The processId",required=true) @PathVariable("processId") Integer processId) {
//
//
//    }
//
//
//
//}
