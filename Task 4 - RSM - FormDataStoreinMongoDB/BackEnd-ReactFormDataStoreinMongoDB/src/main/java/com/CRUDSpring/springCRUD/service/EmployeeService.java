package com.CRUDSpring.springCRUD.service;

import com.CRUDSpring.springCRUD.dto.Employeedto;
import com.CRUDSpring.springCRUD.model.Employee;
import com.CRUDSpring.springCRUD.repository.EmployeeRepository;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
//    private Employeedto employeedto;

    public String createEmployee(Employeedto employeedto) {
        try {
            Employee emp = Employee.builder()
                    .firstName(employeedto.getFirstName())
                    .lastName(employeedto.getLastName())
                    .email(employeedto.getEmail())
                    .password(employeedto.getPassword())

                    .build();
            employeeRepository.save(emp);
        } catch (Exception e) {
            // Handle exception
        }
        return "Employee Created Successfully";
    }

    public List<Employee> getEmployee () {
        List<Employee> empList = new ArrayList<>();
        try {
             empList = employeeRepository.findAll();
        } catch (Exception e) {}
        return empList;
    }

    public String deleteEmployee(String id) {
        try {
            employeeRepository.deleteById(id);
        } catch (Exception e) {}
        return "Employee Deleted Successfully";
    }

    public String updateEmployee(Employeedto emp) {
        try {
            Employee employee = Employee.builder ()
                    .firstName(emp.getFirstName())
                    .lastName(emp.getLastName())
                    .email(emp.getEmail())
                    .password(emp.getPassword())
                    .build();
            employeeRepository.save(employee);
        } catch (Exception e) {
            // Handle exception
        }
        return "Employee Updated Successfully";
    }
}