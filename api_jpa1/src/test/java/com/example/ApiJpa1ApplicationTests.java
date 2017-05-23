package com.example;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.test.TestRepository;
import com.example.test.TestService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiJpa1ApplicationTests {

	@Autowired
	private TestRepository testRepository;
	
	@Autowired
	private TestService testService;
	
	@PersistenceContext
	EntityManager em;

	@PersistenceUnit
	private EntityManagerFactory emf;
	
	
	@Test
	public void contextLoads() {
		//System.out.println("test");
		
		/*List<Test> test = new ArrayList<>();
		System.out.println("11111111111");*/
		//testRepository.findAll();
		//System.out.println("this is test get   "+ testService.getAllTest().toString());
		
		/*CriteriaBuilder cb = em.getCriteriaBuilder();
		
		CriteriaQuery<Test> cq = cb.createQuery(Test.class);
		
		Root<Test> m = cq.from(Test.class);
		
		Predicate usernameEqual = cb.equal(m.get("id"), "java");
		
		cq.select(m).where(usernameEqual);
		*/
		/*System.out.println("22");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Test");
		System.out.println("3");*/
		//TypedQuery<Test> qeury = 
		
		
		EntityManager em = emf.createEntityManager();
        List arr_cust = (List)em.createQuery("SELECT g FROM G2 g, Test t where g.id=t.id")
                              .getResultList(); 
		
        System.out.println("11" + arr_cust.toString());
	}

}
