package com.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.entities.Department;
import com.ems.repository.DepartmentRepository;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository drep;

    public Department addDepartment(Department d) {
        return drep.save(d);
    }

    public List<Department> viewAll() {
        return drep.findAll();
    }
}
