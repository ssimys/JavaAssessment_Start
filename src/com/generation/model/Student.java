package com.generation.model;

import java.util.Date;
import java.util.List;

public class Student
    extends Person
    implements Evaluation
{

    float PASS_MIN_GRADE = 3.0f;

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
    }
    private List<Course> enrolledCourses;

    public void enrollToCourse( Course course )
    {
       this.enrolledCourses.add(course);
    
        //TODO
    }

    @Override
    public List<Course> findPassedCourses()
    {
        //TODO
        return this.findPassedCourses();
        //return null;
    }

    public Course findCourseById( String courseId )
    {
        //TODO
      //
        return null;
        //return this.findCourseById ();
    }

    @Override
    public List<Course> getEnrolledCourses()
    {
        //TODO
       return this.enrolledCourses;
      //  return null ;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }

}
