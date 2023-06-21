package com.example.payroll.dto;

import com.fasterxml.jackson.annotation.JsonKey;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;

@ApiModel(description = "Employee representation")
@Validated

public class EmployeeDTO {
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("role")
    private String role = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("id")
    private String id = null;


}
