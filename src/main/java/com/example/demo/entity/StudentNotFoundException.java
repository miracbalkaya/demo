package com.example.demo.entity;

public class StudentNotFoundException extends RuntimeException{

    public StudentNotFoundException(String exception){
        super(exception);
    }
}
