package com.CRUDSpring.springCRUD.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

@Data
@Builder
@Document(value="employee")
public class Employee {

//  private String id; // Add @Id annotation for MongoDB identifier

  private String firstName;
  private String lastName;
  private String email;
  private String password;
  private Map<String, Map<Date, Object>> excelData; // Modify data types accordingly


}
