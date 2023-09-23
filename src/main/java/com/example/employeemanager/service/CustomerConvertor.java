package com.example.employeemanager.service;

import com.example.employeemanager.dto.Projects_DTO;
import com.example.employeemanager.entity.Projects;

public class CustomerConvertor {
    public static Projects_DTO toProjectsDTO(Projects project){
        return new Projects_DTO(project.getProjectId(),project.getProjectName(),project.getProjectDescription(),project.getProjectDeadline(),project.getTechLeadId().getTechLeadId());

    }
}
