package io.arc.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
	private TopicService service;
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return service.getAllTopics();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		 return service.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void putTopic(@RequestBody Topic t) {
		 service.addTopic(t);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic t,@PathVariable String id) {
		 service.addTopic(t);
	}
	
	

}
