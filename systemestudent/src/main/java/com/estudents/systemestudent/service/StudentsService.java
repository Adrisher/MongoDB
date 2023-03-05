package com.estudents.systemestudent.service;

import com.estudents.systemestudent.model.Students;

import java.util.List;

public interface StudentsService {

    List<Students> findAll();

    Students findByStudentNumber(Long studentNumber);

    //Student findByEmail(String correo);
    Students findByEmail(String email);


    List<Students> findByOrderByGpa();

    public void save_or_update_Student(Students student);

    public void delete(String id);


}
