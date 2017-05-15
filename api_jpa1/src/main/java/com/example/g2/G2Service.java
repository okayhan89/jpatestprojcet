package com.example.g2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class G2Service {

	@Autowired
	private G2Repository g2Repository;

	public List<G2> getAllG2() {
		List<G2> g2 = new ArrayList<>();
		g2Repository.findAll().forEach(g2::add);
		return g2;
	}

	public G2 getG2(String id) {
		return g2Repository.findOne(id);
	}

	public void addG2(G2 g2) {
		g2Repository.save(g2);
	}

	public void updateG2(String id, G2 g2) {
		g2Repository.save(g2);
	}

	public void deleteG2(String id) {
		g2Repository.delete(id);
	}
}
