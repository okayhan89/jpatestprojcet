package com.example.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.example.g2.G2;
import com.example.g2.G2Repository;
import com.example.topic.Topic;



@Service
public class TestService {

	@Autowired
	private TestRepository testRepository;

	@Autowired
	private G2Repository g2Repository;
	
	public List<Test> getAllTest() {
		List<Test> test = new ArrayList<>();
		testRepository.findAll().forEach(test::add);
		return test;
	}

	public Test getTest(String id) {
		return testRepository.findOne(id);
	}

	public void addTest(Test test) {
		testRepository.save(test);
	}

	public void updateTest(String id, Test test) {
		testRepository.save(test);
	}

	public void deleteTest(String id) {
		testRepository.delete(id);
	}

	
	
}
