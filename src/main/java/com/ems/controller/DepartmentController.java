package com.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entities.Department;
import com.ems.service.DepartmentService;



@RestController
public class DepartmentController {

    @Autowired
    DepartmentService service;

    @PostMapping("/addDepartment")
    public ResponseEntity<Department> addDepartment(@RequestBody Department d) {
      return new ResponseEntity<>(service.addDepartment(d), HttpStatus.OK);
    }

    @GetMapping("/viewAll")
    public ResponseEntity<List<Department>> viewAll() {
        return new ResponseEntity<>(service.viewAll(), HttpStatus.OK);
    }
    
    
}

