package com.finalvariable;

abstract class Bike {
	abstract void run();
// int speedlimit =90;
//
//void run() {
//	speedlimit=400;
//}}
}
	class Honda4 extends Bike{
		void run()
		{
			System.out.println("run safelly");
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike obj=new Honda4();
		obj.run();
		

	}

}
