package com.strategy.demo;

public class DuckTest {

	public static void main(String[] args) {
	
		Duck miniduck = new MiniDuck();
		Duck modelduck = new ModelDuck();
		
		miniduck.performFly();
		modelduck.performFly();
	}
}
