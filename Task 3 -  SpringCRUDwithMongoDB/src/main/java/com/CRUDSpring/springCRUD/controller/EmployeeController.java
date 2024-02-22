package com.CRUDSpring.springCRUD.controller;

import com.CRUDSpring.springCRUD.model.Employee;
import com.CRUDSpring.springCRUD.dto.Employeedto;  // Import Employeedto class

import com.CRUDSpring.springCRUD.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public String createEmployee(@RequestBody Employeedto emp) {
        return employeeService.createEmployee(emp);
    }

    @GetMapping("/get")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getEmployee(){
        return employeeService.getEmployee();

    }
    @DeleteMapping ("/delete")
    @ResponseStatus (HttpStatus.OK)
    public String deleteEmployee(@RequestParam String id) {
        return employeeService.deleteEmployee(id);
    }

    @PutMapping ("/update")
    @ResponseStatus (HttpStatus.CREATED)
    public String updateEmployee(@RequestBody Employeedto emp) {
        return employeeService.updateEmployee(emp);
    }
}
