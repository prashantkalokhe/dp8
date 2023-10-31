package com.inheritance;

public class Pulsar extends Bike {
	
	public void bikeinfo(String colour,int speed) {
		this.colour=colour;
		this.speed=speed;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pulsar obj= new Pulsar();
		obj.bikeinfo("blue", 55);
		System.out.println(obj);

	}

}
