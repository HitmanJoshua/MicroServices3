package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodOrderController {

	
	@GetMapping("/getPastOrders")
	public String getPastTrips()
	{
		return "springroll,kabab,pasta";
	}
	
	@GetMapping("/upcomingOrders")
	public String upcomingTrips()
	{
		return "biryani,pizza";
	}
}
