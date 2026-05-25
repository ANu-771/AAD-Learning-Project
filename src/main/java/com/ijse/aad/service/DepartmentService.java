package com.ijse.aad.service;

import com.ijse.aad.dto.DepartmentDTO;

import java.util.List;

public interface DepartmentService {
    DepartmentDTO saveDepartment(DepartmentDTO departmentDTO);

    List<DepartmentDTO> getDepartment();
}
