package com.example.employeemanager.repo;

import com.example.employeemanager.entity.Projects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectsRepo extends JpaRepository<Projects, String> {

}
