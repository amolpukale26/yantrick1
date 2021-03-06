package com.app.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.User;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.mysql.cj.xdevapi.JsonArray;

@RestController
@RequestMapping
public class TestController {
	ArrayList<Integer> arr= new ArrayList<Integer>();
	public TestController() {
	System.out.println("Hello Amol");
		// TODO Auto-generated constructor stub
	}
	User user=new User(1,"amol","amol","amol@2020.com","675349867832");
	
	@GetMapping(value = "/de",produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> sayHello() {
	    HashMap<String, String> map = new HashMap<String,String>();
	    map.put("key", "value");
	    map.put("foo", "bar");
	    map.put("aa", "bb");
	    return map;
	}
	@GetMapping("/hi")
	public User getName()
	{
		return user;
	}
	@PostMapping("/hi")
	public String getName1(@RequestParam String name,@RequestParam String domain)
	{
		return name+domain+" ala ka";
	}

}
