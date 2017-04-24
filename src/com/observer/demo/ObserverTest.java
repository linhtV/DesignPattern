package com.observer.demo;

public class ObserverTest {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		TemperatureDisplay temperatureDisplay = new TemperatureDisplay(weatherData);
		
		PressureDisplay pressureDisplay = new PressureDisplay(weatherData);
		
		weatherData.setMeatherments(30.8f, 70.9f);
	}
}
