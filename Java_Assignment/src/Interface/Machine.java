package Interface;
/*
 * 1. Create an abstract class Machine with an implemented / concrete method
rotate and an abstract method crush. Create a class Juicer which extends this
abstract class Machine and implements method crush. Now, add another
method filter in the class Juicer. In main method,
a. Create an object of type Juicer and calls its crush, rotate and filter
methods.
b. Create an object of type Juicer with reference variable of Machine
(Machine m = new Juicer). Check the methods available to m.
 */
abstract class Machine {
	void rotate() {
		System.out.println("machine is working");
	}
	abstract void crush();	
	}
class Juicer extends Machine{
	void crush() {
		System.out.println("juicer is crushing");
	}
	void filter() {
		System.out.println("juicer is filtering");
	}


	
public static void Main(String[]args){
	
}
}