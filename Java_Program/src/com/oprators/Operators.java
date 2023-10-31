package com.oprators;

public class Operators {

	public static void main(String[] args) {
		// int x=1;
		// int y=1;
		// int z= ++x + ++y + x-- - --y +x ;
		// System.out.println("value of x is"+ x + "value of y is :"+ y +"value of z is
		// : "+ z);

		// int x=1;
		// int y=1;
		// int z= x++ + y++ -y-- - x-- - --x - --y ;
		// System.out.println("value of x is"+ x + "value of y is :"+ y +"value of z is
		// : "+ z);
		// -2

		// eq3
		// int x=1;
		// int y=1;
		// int z= x-- -(x/2)- --x +x++ + ++y ;
		// System.out.println("value of x is"+ x + "value of y is :"+ y +"value of z is
		// : "+ z);
		// 3

		/*
		 * int a=1; int b=1; int z= a++ + b++ ; System.out.println("value of a is"+ a +
		 * "value of b is :"+ b +"value of z is : "+ z); int z1= ++a +b++ +a;
		 * System.out.println("value of a is"+ a + "value of b is :"+ b
		 * +"value of z is : "+ z1); int z2= a-- - --b - a;
		 * System.out.println("value of a is"+ a + "value of b is :"+ b
		 * +"value of z is : "+ z2); //a=2 b=2 z=2 //a= 3 b=3 z=8 //a= 2 b= 2 z=-1
		 */

		/*
		 * int a=2; int b=3; int z= ++a + ++b ; System.out.println("value of a is"+ a +
		 * "value of b is :"+ b +"value of z is : "+ z); int z1= ++a +b++ +a;
		 * System.out.println("value of a is"+ a + "value of b is :"+ b
		 * +"value of z is : "+ z1); int z2= a++ + b++ +b +a;
		 * System.out.println("value of a is"+ a + "value of b is :"+ b
		 * +"value of z is : "+ z2); int z3= ++a + b++ +a;
		 * System.out.println("value of a is"+ a + "value of b is :"+ b
		 * +"value of z is : "+ z3); int z4= a++ + b++ +b +a;
		 * System.out.println("value of a is"+ a + "value of b is :"+ b
		 * +"value of z is : "+ z4); //a=3 b=4 z=7 //a= 4 b=5 z=12 //a= 5 b= 6 z=20
		 * //a=6 b=7 z=18 //a= 7 b=8 z=28
		 */

		/*
		 * int a=2; int b=3; int z= ++a + ++b ; System.out.println("value of a is"+ a +
		 * "value of b is :"+ b +"value of z is : "+ z); int z1= ++a +b++ +a;
		 * System.out.println("value of a is"+ a + "value of b is :"+ b
		 * +"value of z is : "+ z1); int z2= a++ + b++ +b +a;
		 * System.out.println("value of a is"+ a + "value of b is :"+ b
		 * +"value of z is : "+ z2); int z3= --a - --b-b ;
		 * System.out.println("value of a is"+ a + "value of b is :"+ b
		 * +"value of z is : "+ z3); int z4= a-- - b-- - --a;
		 * System.out.println("value of a is"+ a + "value of b is :"+ b
		 * +"value of z is : "+ z4); //a=3 b=4 z=7 //a= 4 b=5 z=12 //a= 5 b= 6 z=20
		 * //a=4 b=5 z=-6 //a= 2 b=4 z=-3
		 */

		int a = 2;
		int b = 3;
		int c = 2;
		int z = c++ + a++ + b++;
		System.out
				.println("value of a is" + a + "value of b is :" + b + "value of c is :" + c + "value of z is : " + z);
		int z1 = ++a - ++b - ++c;
		System.out
				.println("value of a is" + a + "value of b is :" + b + "value of c is :" + c + "value of z is : " + z1);
		int z2 = --a - b-- + c--;
		System.out
				.println("value of a is" + a + "value of b is :" + b + "value of c is :" + c + "value of z is : " + z2);
		int z3 = ++a + b++ + a;
		System.out
				.println("value of a is" + a + "value of b is :" + b + "value of c is :" + c + "value of z is : " + z3);
		int z4 = a++ + b++ + b + a;
		System.out
				.println("value of a is" + a + "value of b is :" + b + "value of c is :" + c + "value of z is : " + z4);
		// a=3 b=4 z=7
		// a= 4 b=5 z=12
		// a= 5 b= 6 z=20
		// a=6 b=7 z=18
		// a= 7 b=8 z=28

	}

}
