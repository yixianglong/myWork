package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	private Me me;
	
   @GetMapping(value="/")
	//@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(@RequestParam(value="id" ,required = false,defaultValue="1") Integer myid) {
		return myid+me.getName() + ":" + me.getAge() + ": from Spring Boot!";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String ssy(@RequestParam("id") Integer myid) {
		return myid+me.getName() + ":" + me.getAge() + ": from Spring Boot!";
	}
	

}
