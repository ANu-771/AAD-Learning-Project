package com.ijse.aad.controller;

import com.ijse.aad.dto.DepartmentDTO;
import com.ijse.aad.service.DepartmentService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "v1/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public DepartmentDTO SaveDepartment() {
        DepartmentDTO departmentDTO = departmentService.saveDepartment();
        return departmentDTO;
    }

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<DepartmentDTO> getDepartments() {
        return departmentService.getDepartment();
    }
}

