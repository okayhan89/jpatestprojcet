package com.example.topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.example.g2.G2;

@Entity
public class Topic {

	@Id
	private String id;
	private String name;
	private String position;
	@ManyToOne
	private G2 g2;
	
	public Topic(){
		
	}
	
	public Topic(String id, String name, String position, String g2Id){
		super();
		this.id=id;
		this.name=name;
		this.position=position;
		this.g2=new G2(g2Id, "", "");
	}
	
	
	public G2 getG2() {
		return g2;
	}
	public void setG2(G2 g2) {
		this.g2 = g2;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	
}
