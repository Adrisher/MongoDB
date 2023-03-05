package com.estudents.systemestudent.repository;

import com.estudents.systemestudent.model.Students;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Students, String> {

    Students findByStudentNumber(Long studentNumber);
    Students findByEmail(String email);
    List<Students> findByOrderByGpa();
}
