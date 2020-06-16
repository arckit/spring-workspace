package io.arc.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CouseRepository extends CrudRepository<Course,String>{

	public List<Course> findByTopicId(String topicId);
	
}
