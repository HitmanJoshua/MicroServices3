package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class TripDetailController {

	@GetMapping("/getPastTrips")
	public String getPastTrips()
	{
		return "ch-40-ch-50,ch-60-ch-117";
	}
	
	@GetMapping("/upcomingTrips")
	public String upcomingTrips()
	{
		return "ch-117 to ch-40";
	}
}
