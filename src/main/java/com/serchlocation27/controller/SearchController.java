package com.serchlocation27.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.serchlocation27.dto.Location;

@Controller
public class SearchController {
	//method
	@RequestMapping(value="/show", method = RequestMethod.GET)
	public String showSearchLocatonPage() {
		return "search_location";
	}
	
	@RequestMapping("/getLocation")
	public String getLocation(@RequestParam("id") long id, ModelMap model) {
		//System.out.println(id);
		LocationRestClint clint = new LocationRestClint();
		Location location = clint.getLocationData(id);
		model.addAttribute("location", location);
//		System.out.println(location.getId());
//		System.out.println(location.getName());
//		System.out.println(location.getCodes());
//		System.out.println(location.getType());
		
		return "serch_result";
	}
}
		