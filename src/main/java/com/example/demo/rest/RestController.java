package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    StudentService studentService;
 
    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
}
