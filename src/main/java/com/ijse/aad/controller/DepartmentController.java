package com.ijse.aad.controller;

import com.ijse.aad.dto.DepartmentDTO;
import com.ijse.aad.service.DepartmentService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "v1/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public DepartmentDTO SaveDepartment(@RequestBody DepartmentDTO departmentDTO) {
        return departmentService.saveDepartment(departmentDTO);
    }

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<DepartmentDTO> getDepartments() {
        return departmentService.getDepartment();
    }

    @GetMapping(value = "/{departmentId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public DepartmentDTO getDepartmentDetail(@PathVariable long departmentId) {
        return departmentService.getDepartmentDetail(departmentId);
    }
}

