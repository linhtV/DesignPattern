package com.observer.demo;

public class PressureDisplay implements Observer {

	private float pressure;
	private Subject weatherData;
	public PressureDisplay(Subject weatherData) {
		
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
		
	}
	
	@Override
	public void update(float temperature,float pressure) {

		this.pressure = pressure;
		display();	
	}

	public void display()
	{
		System.out.println("current pressure is" + pressure);
	}

}
