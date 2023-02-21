package com.springbootrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootrest.springrest.dao.CourseDao;
import com.springbootrest.springrest.entity.Course;
@Service
public class courseServiceImpl implements courseService {
	    @Autowired //automatically inject dependency
	    private CourseDao coursedao;
	
//	     List<Course> list;
	     public courseServiceImpl() {
//	    	 list = new ArrayList<>();
//	    	 list.add(new Course(145 , "java" , "java basics"));
//	    	 list.add(new Course(147 , "spring" , "spring orm"));
	     }
	     @Override
         public List<Course> getCourses(){
        	 return coursedao.findAll();
         }
		@Override
		public Course getCourse(long cid) {
			
//			Course c  = null;
//			for(Course  cou : list) {
//				if(cou.getId()==cid) {
//					c=cou;
//					break;
//				}
//			}
//			return c;
			return coursedao.getOne(cid);
		}
		@Override
		public Course addCourse(Course course) {
		//	list.add(course);
			coursedao.save(course);
			return course;
		}
		@Override
		public Course updateCourse(Course course) {
//			Course c  = null;
//			for(Course  cou : list) {
//				if(cou.getId()==course.getId()) {
//					
//					cou.setTitle(course.getTitle());
//					cou.setDescription(course.getDescription());
//					c=cou;
//					break;
//				}
//			}
//			return c;
			coursedao.save(course);
			return course;
		}
		@Override
		public void deleteCourse(long cid) {
			
//			for(Course  cou : list) {
//				if(cou.getId()==cid) {
//					list.remove(cou);
//					break;
//				}
//			}
			Course entity= coursedao.getOne(cid);
			coursedao.delete(entity);
			
		}
}
