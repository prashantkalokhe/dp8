package com.containment;

public class MyDate {

	int d,m,y;
	
	public MyDate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyDate(int d, int m, int y) {
		super();
		this.d = d;
		this.m = m;
		this.y = y;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "MyDate [d=" + d + ", m=" + m + ", y=" + y + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyDate md=new MyDate();
		System.out.println(md);
	}

}
