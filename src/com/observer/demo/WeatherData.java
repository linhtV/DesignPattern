package com.observer.demo;

import java.util.ArrayList;

public class WeatherData implements Subject {

	private ArrayList observers;
	
	private float temperature;
	
	private float pressure;
	
	public  WeatherData() {
	
		observers = new ArrayList();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		
		int i = observers.indexOf(o);
		
		if(i>0)
		{
			observers.remove(i);
		}

	}

	@Override
	public void notifyObservers() {
		
		for(int i = 0; i < observers.size();i++)
		{
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature,pressure);
		}

	}
	
	public void measurementsChanged()
	{
		notifyObservers();
	}

	public void setMeatherments(float temperature,float pressure) {
		this.temperature = temperature;
		this.pressure = pressure;
		measurementsChanged();
	}
}
