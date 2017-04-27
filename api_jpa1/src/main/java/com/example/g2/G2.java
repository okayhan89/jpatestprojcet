package com.example.g2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class G2 {

	@Id
	private String id;
	private String name;
	
	/*public G2(){
		
	}
	
	public G2(int id, String name){
		super();
		this.id=id;
		this.name=name;
	}
	*/
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
	
	
}
