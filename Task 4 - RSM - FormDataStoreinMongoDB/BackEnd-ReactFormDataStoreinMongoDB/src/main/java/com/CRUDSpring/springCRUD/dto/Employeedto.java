package com.CRUDSpring.springCRUD.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

@Data
@Builder
public class Employeedto {
    private String firstName;
    @Field(name = "employee_name")
    private String lastName;
    private String email;

    private String password;


}

