package com.CRUDSpring.springCRUD.repository;

import com.CRUDSpring.springCRUD.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends  MongoRepository<Employee, String> {
}
