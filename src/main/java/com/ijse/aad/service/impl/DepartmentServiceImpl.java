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
    public DepartmentDTO saveDepartment(DepartmentDTO departmentDTO) {

        log.info("DepartmentServiceImpl saveDepartment()",departmentDTO);

        Department department = new Department();
        department.setDepartmentName(departmentDTO.getDepartmentName());
        department.setDepartmentLocation(departmentDTO.getDepartmentLocation());

        Department savedDepartment = departmentRepository.save(department);
//        departmentRepository.save(department);
        log.info("Department Saved.........");

        departmentDTO.setDepartmentId(savedDepartment.getDepartmentId());


        log.info("Department returned.........");

        return departmentDTO;
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
