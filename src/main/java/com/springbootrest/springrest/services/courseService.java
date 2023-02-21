package com.springbootrest.springrest.services;

import java.util.List;

import com.springbootrest.springrest.entity.Course;

public interface courseService {
   public List<Course> getCourses();

   public Course getCourse(long cid);

   public Course addCourse(Course course);

   public Course updateCourse(Course course);

   public void deleteCourse(long cid);
}
