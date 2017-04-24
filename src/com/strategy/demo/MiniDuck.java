package com.strategy.demo;

public class MiniDuck extends Duck {

	@Override
	public void display() {
		
		System.out.println("I am a miniDuck");

	}
	
	public MiniDuck() {
		flyBehavior = new FlyWithWings();
	}
}
