package com.example.test;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.topic.Topic;

@RestController
public class TestController {

	@Autowired
	private TestService testService;

	@RequestMapping("/test")
	public List<Test> getAllTest() {
		return testService.getAllTest();
	}

	@RequestMapping("/test/{id}")
	public Test getTest(@PathVariable String id) {
		return testService.getTest(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/test")
	public void addTest(@RequestBody Test test) {
		testService.addTest(test);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/test/{id}")
	public void updateTest(@RequestBody Test test, @PathVariable String id) {
		testService.updateTest(id, test);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/test/{id}")
	public void deleteTest(@PathVariable String id) {
		testService.deleteTest(id);
	}

	// 세타 조인 : 관계가 없는 database 조인
	// 하는 이유 : legacy db 사용을 하기 위함.
	@PersistenceUnit
	private EntityManagerFactory emf;

	@RequestMapping("/test/jpql")
	public List getjpql() {

		EntityManager em = emf.createEntityManager();
		List arr_cust = (List) em.createQuery("SELECT g FROM G2 g, Test t where g.id=t.id").getResultList();

		return arr_cust;

	}

}
