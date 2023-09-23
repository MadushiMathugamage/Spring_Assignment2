package com.example.employeemanager.config;

import com.example.employeemanager.advisor.ApplicationAdvisor;
import com.example.employeemanager.endpoints.TechLeadController;
import com.example.employeemanager.response.Response;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@ComponentScan(basePackageClasses = {Response.class, ApplicationAdvisor.class, TechLeadController.class})
@EnableWebMvc
public class WebAppConfig {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
