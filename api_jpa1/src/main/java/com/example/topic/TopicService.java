package com.example.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getAllTopic(String g2Id) {
		List<Topic> topic = new ArrayList<>();
		topicRepository.findByG2Id(g2Id);
		return topic;
	}

	public Topic getTopic(String id) {
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.delete(id);
	}
}
