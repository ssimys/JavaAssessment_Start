package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.*;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId )
    {
//TODO
        return null;

    }
      //Student getStudent = StudentService.getStudentInformation(studentService);
       
    /*
    if (getStudent!= null ){
        System.out.println(("Student Found \n" + getStudent));
    }
    else {
        System.out.println("Student not found , Please try again");
    }
    */
    public boolean showSummary()
    {
        //TODO
        return false;
    }

    public void enrollToCourse( String studentId, Course course )
    {
        //TODO

    }
}
