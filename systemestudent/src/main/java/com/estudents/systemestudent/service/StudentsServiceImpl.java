package com.estudents.systemestudent.service;

import com.estudents.systemestudent.model.Students;
import com.estudents.systemestudent.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsServiceImpl implements StudentsService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Students> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Students findByStudentNumber(Long studentNumber) {
        return studentRepository.findByStudentNumber(studentNumber);
    }

    @Override
    public Students findByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    @Override
    public List<Students> findByOrderByGpa() {
        return studentRepository.findByOrderByGpa();
    }

    @Override
    public void save_or_update_Student(Students student) {
        studentRepository.save(student);
    }

    @Override
    public void delete(String id) {

        studentRepository.deleteById(id);
    }
}
