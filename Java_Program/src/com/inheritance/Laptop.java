package com.inheritance;

public class Laptop {
	int noOfUSBPort;
	int processorSpeed;
	
	public Laptop(){
		noOfUSBPort=0;
		processorSpeed=0;
	}
	public Laptop(int usbport,int speed)
	{
		this.noOfUSBPort=usbport;
		this.processorSpeed=speed;
	}
	
	public int getNoOfUSBPort() {
		return noOfUSBPort;
	}
	public void setNoOfUSBPort(int noOfUSBPort) {
		this.noOfUSBPort = noOfUSBPort;
	}
	public int getProcessorSpeed() {
		return processorSpeed;
	}
	public void setProcessorSpeed(int processorSpeed) {
		this.processorSpeed = processorSpeed;
	}
	
	public static void main(String []args) {
		Laptop obj=new Laptop();
		obj.setNoOfUSBPort(4);
		obj.setProcessorSpeed(3);
		System.out.println("processorSpeed");
		System.out.println(obj.getProcessorSpeed());
		System.out.println("noOfUSBPort");
		System.out.println(obj.getNoOfUSBPort());

	}
}
