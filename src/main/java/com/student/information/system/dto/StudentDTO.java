package com.student.information.system.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class StudentDTO {

    private String id;

    private String name;

    private long studentNumber;

    private String email;

    private List<String> courseList;

    private float gpa;

    public StudentDTO() {

    }


}


