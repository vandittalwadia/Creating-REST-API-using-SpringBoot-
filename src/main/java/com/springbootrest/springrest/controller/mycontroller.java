package com.springbootrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrest.springrest.entity.Course;
import com.springbootrest.springrest.services.courseService;

@RestController
public class mycontroller {
	
	@Autowired
	private courseService cserv;
	
	 @GetMapping("/home")
      public String home() {
    	  return "welcome home";
      }
	 @GetMapping("/courses")
	 public List<Course> getCourses(){
		 return this.cserv.getCourses();
	 }
	 
	 @GetMapping("/courses/{cid}")
	 public Course getCourse(@PathVariable String cid) {
		 return this.cserv.getCourse(Long.parseLong(cid));
	 }
	 @PostMapping("/courses")
	 public Course addCourse(@RequestBody Course course) {
		 return this.cserv.addCourse(course);
	 }
	 @PutMapping("/courses")
	 public Course updateCourse(@RequestBody Course course) {
		 return this.cserv.updateCourse(course);
	 }
	 @DeleteMapping("/courses/{cid}")
	 public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String cid){
		 try {
			 this.cserv.deleteCourse(Long.parseLong(cid));
			 return new ResponseEntity<>(HttpStatus.OK);
		 }catch(Exception e) {
			 return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		 }
	 }
}
