package com.example.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.g2.G2;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/g2/{id}/topic")
	public List<Topic> getAllTopic(@PathVariable String id){
		return topicService.getAllTopic(id);
	}
	
	@RequestMapping("/g2/{g2Id}/topic/{id}")
	public Topic getTopic(@PathVariable String id){
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/g2/{g2Id}/topic")
	public void addTopic(@RequestBody Topic topic, @PathVariable String g2Id){
		topic.setG2(new G2(g2Id, "", ""));
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT , value="/g2/{g2Id}/topic/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable String g2Id , @PathVariable String id){
		topic.setG2(new G2(g2Id, "", ""));
		topicService.updateTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE , value="/g2/{g2Id}/topic/{id}")
	public void deleteTopic(@PathVariable String id){
		topicService.deleteTopic(id);
	}
	
	
}
