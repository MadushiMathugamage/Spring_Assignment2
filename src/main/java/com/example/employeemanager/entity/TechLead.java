package com.example.employeemanager.entity;

import com.example.employeemanager.dto.TechLead_DTO;
import com.example.employeemanager.response.Response;
import com.example.employeemanager.service.TechLeadService;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/techLead")
@CrossOrigin

public class TechLead {
    @Autowired
    private TechLeadService techLeadService;

    @PostMapping(path = "/save", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Response save(@RequestBody TechLead_DTO techLead_dto) {
        return techLeadService.save(techLead_dto);

    }

    @PutMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)

    public Response update(@RequestBody TechLead_DTO techLead_dto) {
        return techLeadService.update(techLead_dto);

    }

    @GetMapping(path = "/search", params = "techLeadId", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response search(@RequestParam("techLeadId") String techLeadId) {
        return techLeadService.search(techLeadId);


    }

    @DeleteMapping(path = "/delete", params = "techLeadId", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response delete(@RequestParam("techLeadId") String techLeadId) {
        return techLeadService.delete(ID.valueOf(techLeadId));
    }

    @GetMapping(path = "/fetchAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response getAll() {
        return techLeadService.getAll();
    }
}
