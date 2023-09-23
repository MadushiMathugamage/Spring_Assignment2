package com.example.employeemanager.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Projects_DTO {
    private String projectId;
    private String projectName;
    private String projectDescription;
    private String projectDeadline;
    private String techLeadId;
}
