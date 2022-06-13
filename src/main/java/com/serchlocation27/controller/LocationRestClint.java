package com.serchlocation27.controller;

import org.springframework.web.client.RestTemplate;

import com.serchlocation27.dto.Location;

public class LocationRestClint {
	//hear Location object, here copy a data as client
	public Location getLocationData(long id) {
		//here consume of web services
		RestTemplate restTemplate = new RestTemplate(); 
		//restTEmplate is built-in class spring framework
		Location location = restTemplate.getForObject("http://localhost:8080/location/api/get/"+id, Location.class);
		//getForObject built-in method for calling url. and put it content in location object.
		return location;
		//here it will get location json objject is copied into java location  object.
		//then it will return back to serch controller
	}
}
