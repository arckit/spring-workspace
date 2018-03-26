package org.arc.controllers;

import java.util.Arrays;
import java.util.List;

import org.arc.beans.Topic;
import org.arc.services.TopicService;
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
	public void getTopic(@PathVariable String id) {
		 service.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics/{id}")
	public void putTopic(@RequestBody Topic t) {
		 service.addTopic(t);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic t,@PathVariable String id) {
		 service.addTopic(t);
	}
	
	

}
