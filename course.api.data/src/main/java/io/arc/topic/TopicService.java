package io.arc.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
private List<Topic> list = new ArrayList<Topic>();
@Autowired
private TopicRepository repo;
	
public List<Topic> getAllTopics(){
	List<Topic> list = new ArrayList<Topic>();
	for (Topic t:repo.findAll()) {
		list.add(t);
	}
	return list;
}
public void addTopic(Topic t){
	repo.save(t);
}
public void deleteTopic(Topic t){
	repo.delete(t);
}
public Topic getTopic(String t){

	return repo.findById(t).get();
	
}

}


