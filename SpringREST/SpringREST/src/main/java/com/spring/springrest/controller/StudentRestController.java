/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.springrest.controller;

import com.spring.springrest.DAO.StudentDAO;
import com.spring.springrest.model.Student;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author banti
 */
@RestController
public class StudentRestController {

    @Autowired  
    private StudentDAO studentDao;

    @GetMapping("/students")
    public List getStudents() {
        return studentDao.list();
    }

    @GetMapping("/student/{id}")
    public ResponseEntity getStudent(@PathVariable("id") Long id) {
        Student student = studentDao.get(id);
        if (student == null) {
            return new ResponseEntity("No Student Found!!" + id, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(student, HttpStatus.OK);
    }

    @PostMapping(value = "/students")
    public ResponseEntity createStudent(@RequestBody Student student) {
        studentDao.create(student);
        return new ResponseEntity(student, HttpStatus.OK);
    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity deleteStudent(@PathVariable("id") Long id) {
        if (null == studentDao.delete(id)) {
            return new ResponseEntity("No student found!!" + id, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(id, HttpStatus.OK);
    }

    @PutMapping("/student/{id}")
    public ResponseEntity updateStudent(@PathVariable Long id, @RequestBody Student student) {
        student = studentDao.update(id, student);
        if(null == student) {
            return new ResponseEntity("No student Found"+ id, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(student,HttpStatus.OK);
    }
}
