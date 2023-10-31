package com.oop;

public class Gettersetter {

	private int dd, mm, yy;
	public Gettersetter() {
		System.out.println("This is default constuctor");
		dd=23;
		mm=12;
		yy=2022;
		
	}
	public Gettersetter(int d,int m,int y){
		System.out.println("This is parameterised constuctor");
	dd=15;
	mm=6;
	yy=2012;}

	public void setDd(int d) {
		dd = d;
	}

	public void setMm(int m) {
		mm = m;
	}

	public void setYy(int y) {
		yy = y;
	}

	public int getDd() {
		return dd;
	}

	public int getMm() {
		return mm;
	}

	public int getYy() {
		return yy;
	}

	public void SetData(int d, int m, int y) {
		dd = d;
		mm = m;
		yy = y;
	}

	public void printDate() {
		System.out.println("Date is" + dd + "/" + mm + "/" + yy);
	}
	public Gettersetter getObject() {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
		return this;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gettersetter obj = new Gettersetter();
		//obj.SetData(17, 10, 2023);
		obj.printDate();
		
		Gettersetter o=obj.getObject();
				o.printDate();
				obj.getDd();
		obj.getMm();
		obj.getYy();

		
	}

}
