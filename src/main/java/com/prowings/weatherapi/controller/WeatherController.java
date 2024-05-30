package com.prowings.weatherapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.weatherapi.model.WeatherData;

@RestController
public class WeatherController {


	@GetMapping("/weather")
	public WeatherData getWeather(@RequestParam String city) {

		return new WeatherData(city, "Sunny", 25.0, 60.0, 10.0);
	}

}
