package com.strategy.demo;

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	
	public abstract void display();
	
	public void performFly()
	{
		flyBehavior.fly();
	}
	
	public void swim()
	{
		System.out.println("all ducks  can swim");
	}
	
}
