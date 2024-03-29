package io.arc.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@Autowired
	private CouseService service;
	/*@RequestMapping("/course")
	public List<Course> getAllcourse() {
		return service.getAllCourse();
	}*/
	
	@RequestMapping(method=RequestMethod.GET, value="/course/{id}")
	public Course getTopic(@PathVariable String id) {
		 return service.getTopic(id);
	}
	/*
	@RequestMapping(method=RequestMethod.POST, value="/course")
	public void putTopic(@RequestBody Course t) {
		 service.addTopic(t);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/course/{id}")
	public void updateTopic(@RequestBody Course t,@PathVariable String id) {
		 service.addTopic(t);
	}*/
	
	

}
