package com.ijse.aad.service.impl;

import com.ijse.aad.dto.DepartmentDTO;
import com.ijse.aad.entity.Department;
import com.ijse.aad.repository.DepartmentRepository;
import com.ijse.aad.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService{

    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }


    @Override
    public DepartmentDTO saveDepartment() {

        log.info("DepartmentServiceImpl saveDepartment()");

        Department department = new Department();
        department.setDepartmentName("IT");
        department.setDepartmentLocation("Colombo");

        departmentRepository.save(department);
        log.info("Department Saved.........");

        DepartmentDTO responseDTO = new DepartmentDTO();
        responseDTO.setDepartmentId(department.getDepartmentId());
        responseDTO.setDepartmentName(department.getDepartmentName());
        responseDTO.setDepartmentLocation(department.getDepartmentLocation());

        log.info("Department returned.........");

        return responseDTO;
    }

    @Override
    public List<DepartmentDTO> getDepartment() {
        log.info("DepartmentServiceImpl getDepartment()");

        try {

            List<DepartmentDTO> responseList = new ArrayList<>();
            List<Department> departmentList = departmentRepository.findAll();

            for (Department department : departmentList) {
                DepartmentDTO responseDTO = new DepartmentDTO();
                responseDTO.setDepartmentId(department.getDepartmentId());
                responseDTO.setDepartmentName(department.getDepartmentName());
                responseDTO.setDepartmentLocation(department.getDepartmentLocation());

                responseList.add(responseDTO);
            }

            return responseList;

        }catch (Exception e){
            log.info("Error in getDepartment() method");
            return null;
        }
    }
}
