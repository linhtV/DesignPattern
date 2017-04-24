package com.observer.demo;

public class TemperatureDisplay implements Observer {

	private float temperature;
	private Subject weatherData;
	public TemperatureDisplay(Subject weatherData) {
		
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
		
	}
	
	@Override
	public void update(float temperature,float pressure) {

		this.temperature = temperature;
		display();	
	}

	public void display()
	{
		System.out.println("current temperature is" + temperature);
	}
}
