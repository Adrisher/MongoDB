package com.estudents.systemestudent.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Setter
@Getter
@Document(collection = "Students")
public class Students {

    @Id
    private String _id_student;
    private String nombre;
    private Long StudentNumber ;
    private String email;
    private List<String> courseList;
    private float gpa;
}
