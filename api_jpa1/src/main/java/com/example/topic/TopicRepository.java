package com.example.topic;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>{

	public List<Topic> findByG2Id(String g2Id);
	
}
