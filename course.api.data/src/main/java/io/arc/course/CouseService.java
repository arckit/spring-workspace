package io.arc.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouseService {
	
private List<Course> list = new ArrayList<Course>();
@Autowired
private CouseRepository repo;
	
public List<Course> getAllCourse(String topicId){
	List<Course> list = new ArrayList<Course>();
	for (Course t:repo.findByTopicId(topicId)) {
		list.add(t);
	}
	return list;
}
public void addCourse(Course t){
	repo.save(t);
}
public void deleteCourse(Course t){
	repo.delete(t);
}
public Course getCourse(String t){

	return repo.findById(t).get();
	
}
public Course getTopic(String id) {
	// TODO Auto-generated method stub
	return null;
}

}


