package com.example.employeemanager.service;

import com.example.employeemanager.dto.TechLead_DTO;
import com.example.employeemanager.entity.TechLead;
import com.example.employeemanager.repo.TechLeadRepo;
import com.example.employeemanager.response.Response;
import com.sun.xml.bind.v2.model.core.ID;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class TechLeadServiceImpl implements TechLeadService{

    @Autowired
    private TechLeadRepo techLeadRepo;
    @Autowired
    private Response response;
    @Autowired
    private ModelMapper mapper;

    @Override
    public Response save(T t) {
        if (search(TechLead_DTO.getTechLeadId()).getData() == null) {
            techLeadRepo.save(mapper.map(TechLead_DTO, TechLead.class));
            return createAndSendResponse(HttpStatus.OK.value(), "Employee Successfully saved!", null);

        }
        throw new RuntimeException("Employee already exists!");
    }

    @Override
    public Response update(T t) {
        techLeadRepo.save(mapper.map(TechLead_DTO, TechLead.class));
        return createAndSendResponse(HttpStatus.OK.value(), "Employee Successfully updated!", null);

    }
        throw new void RuntimeException("Employee does not exists!");
    }

    @Override
    public Response delete(ID id) {
        if (search(s).getData() != null) {
            techLeadRepo.deleteById(s);
            return createAndSendResponse(HttpStatus.OK.value(), "Employee Successfully deleted!", null);

        }
        throw new RuntimeException("Employee does not exists!");
    }

    @Override
    public Response search(ID id) {
        Optional<TechLead> techLead = techLeadRepo.findById(s);
        if (techLead.isPresent()) {
            return createAndSendResponse(HttpStatus.FOUND.value(), "Employee Successfully retrieved!", mapper.map(techLead.get(), TechLead_DTO.class));

        }
        return createAndSendResponse(HttpStatus.NOT_FOUND.value(), "Employee doe not exists!", null);
    }

    @Override
    public Response getAll() {
        List<TechLead> techLeads = techLeadRepo.findAll();
        if (!techLeads.isEmpty()) {
            ArrayList<TechLead_DTO> techLead_dtos = new ArrayList<>();
            techLeads.forEach((techLead) -> {
                techLead_dtos.add(mapper.map(techLead, TechLead_DTO.class));

            });
            return createAndSendResponse(HttpStatus.FOUND.value(), "Employees Successfully retrieved!", techLead_dtos);


        }
        throw new RuntimeException("No employees found in the database!");
    }

    @Override
    public Response createAndSendResponse(int statusCode, String message, Object data) {
        return null;
    }
}
