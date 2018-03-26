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
	
public List<Course> getAllTopics(){
	List<Course> list = new ArrayList<Course>();
	for (Course t:repo.findAll()) {
		list.add(t);
	}
	return list;
}
public void addTopic(Course t){
	repo.save(t);
}
public void deleteTopic(Course t){
	repo.delete(t);
}
public Course getTopic(String t){

	return repo.findById(t).get();
	
}

}


