package com.example.g2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class G2 {

	@Id
	private String id;
	private String name;
	private String position;
	
	public G2(){
		
	}
	
	public G2(String id, String name, String position){
		super();
		this.id=id;
		this.name=name;
		this.position=position;
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
