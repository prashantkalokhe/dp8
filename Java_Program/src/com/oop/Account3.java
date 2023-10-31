package com.oop;

//using static variable
public class Account3 {
	private int accNo;
	private String ownerName;
	private double balance;
	static float interest;
	static {
		interest = 0.8f;
	}

	public static void getinterest() {
		System.out.println("get amount details" +   interest);
		//System.out.println("get amount details" +   Balance);

	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account3 obj = new Account3();
		obj.setBalance(7777);
		obj.setOwnerName("sk");
	}

}
