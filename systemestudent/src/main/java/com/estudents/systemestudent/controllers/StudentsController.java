package com.estudents.systemestudent.controllers;

import com.estudents.systemestudent.model.Students;
import com.estudents.systemestudent.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentsController {
    @Autowired
    private StudentsService studentService;

    @GetMapping(value = "/")
    public List<Students> getAllStudent() {
        return studentService.findAll();
    }

    @GetMapping("/{studentNumber}")
    public Students getStudentByStudentNumber(@PathVariable("studentNumber") Long studentNumber) {
        return studentService.findByStudentNumber(studentNumber);
    }

    @GetMapping(value = "/email/{email}")
    public Students getEmail(@PathVariable("correo") String correo) {
        return studentService.findByEmail(correo);
    }

    @GetMapping(value = "/orderByGpa")
    public List<Students> findAllByOrderByGpaDesc() {
        return studentService.findByOrderByGpa();
    }

    @PostMapping(value = "/")
    public ResponseEntity<?> Save_or_Update_Student(@RequestBody Students student) {
        studentService.save_or_update_Student(student);
        return new ResponseEntity("Estudiante agregado con exito", HttpStatus.OK);
    }

    @DeleteMapping(value = "/{studentNumber}")
    public void deleteStudent(@PathVariable Long studentNumber) {
        studentService.delete(studentService.findByStudentNumber(studentNumber).get_id_student());
    }
}
