package com.example.employeemanager.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TechLead_DTO {
    private String techLeadId;
    private String techLeadName;
    private String techLeadEmail;
    private String techLeadAddress;
}
