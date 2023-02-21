package com.springbootrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootrest.springrest.entity.Course;

public interface CourseDao extends JpaRepository<Course,Long>{
   
}
