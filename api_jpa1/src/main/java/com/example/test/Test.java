package com.example.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.PrimaryKeyJoinColumn;

import com.example.g2.G2;

@Entity
public class Test {

	@Id
	private String id;
	private String name;
	
	public Test(){
		
	}
	
	public Test(String id, String name){
		super();
		this.id=id;
		this.name=name;
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
	
	
}
