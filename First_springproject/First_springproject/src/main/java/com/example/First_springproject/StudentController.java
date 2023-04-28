package com.example.First_springproject;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
// In this we will write API and it's end points
public class StudentController {
    HashMap<Integer , Student> hashMap = new HashMap<>();
    // To store database here

    @PostMapping("/registerStudent")
    // To add data of student
    // registerStudent is end point here
    public void addStudent(@RequestBody Student student){

        int key = student.getRollNo();
        hashMap.put(key , student);
    }

    @GetMapping("getStudentInfo")
    //To retrieve student information from th db
    public Student getStudent(@RequestParam("rollNo")Integer rollNo){
        // we want to get rollNo ,
        // It is of integer type
        // it's parameter name is rollNo here

        Student student = hashMap.get(rollNo);
        return student;
    }
}
