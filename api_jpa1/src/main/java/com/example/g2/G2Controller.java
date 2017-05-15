package com.example.g2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class G2Controller {

	@Autowired
	private G2Service g2Service;
	
	@RequestMapping("/g2")
	public List<G2> getAllG2(){
		return g2Service.getAllG2();
	}
	
	@RequestMapping("/g2/{id}")
	public G2 getG2(@PathVariable String id){
		return g2Service.getG2(id);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/g2")
	public void addG2(@RequestBody G2 g2){
		g2Service.addG2(g2);
	}
	
	@RequestMapping(method=RequestMethod.PUT , value="/g2/{id}")
	public void updateG2(@RequestBody G2 g2, @PathVariable String id){
		g2Service.updateG2(id, g2);
	}
	
	@RequestMapping(method=RequestMethod.DELETE , value="/g2/{id}")
	public void deleteG2(@PathVariable String id){
		g2Service.deleteG2(id);
	}
	
	
}
