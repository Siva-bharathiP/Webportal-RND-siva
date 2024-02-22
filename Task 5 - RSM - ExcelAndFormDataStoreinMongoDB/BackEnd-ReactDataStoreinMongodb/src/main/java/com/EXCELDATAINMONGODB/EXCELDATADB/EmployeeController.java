package com.EXCELDATAINMONGODB.EXCELDATADB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3002", allowedHeaders = "*")
@RestController
@RequestMapping("api/form")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public String createEmployee(@RequestBody Payload payload) {
        return employeeService.createEmployee(payload);
    }

    @GetMapping("/get")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getEmployee() {
        return employeeService.getEmployee();
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String deleteEmployee(@PathVariable String id) {
        return employeeService.deleteEmployee(id);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public String updateEmployee(@RequestBody Employeedto emp) {
        return employeeService.updateEmployee(emp);
    }
}