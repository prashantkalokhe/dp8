package com.containment;

public class Branch {

	int bid;
	String bname;
	Subject sub1;

	public Branch() {
	}

	public Branch(int bid, String bname, Subject sub1) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.sub1 = sub1;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public Subject getSub1() {
		return sub1;
	}

	public void setSub1(Subject sub1) {
		this.sub1 = sub1;
	}

	@Override
	public String toString() {
		return "\nBranch bid=" + bid + ", bname=" + bname + " Subject: " + sub1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Branch br = new Branch();
		System.out.println(br);
		// Subject sub1=new Subject(1003,"System Design");
		Branch br1 = new Branch();
		System.out.println(br1);
	}

}