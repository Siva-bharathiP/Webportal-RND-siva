package com.CRUDSpring.springCRUD.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
@Data
@Builder
@Document(value="employee")
public class Employee {
  private String id;
  private String empName;
  private String location;
  private BigDecimal salary;

}
