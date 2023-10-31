package com.containment;

public class Account {
	private int accNo;
	private String name;
	private double balance;
	static double intRate;
	static {
		intRate = 5.0;
	}

	public Account() {

	}

	Account(int accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public int getAccno() {
		return accNo;
	}

	public void setAccno(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getIntRate() {
		return intRate;
	}

	public static void setIntRate(double intRate) {
		Account.intRate = intRate;
	}

	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj = new Account();
		System.err.println(obj);

		Account obj1 = new Account(56, "pk", 98000);
		System.out.println(obj1);
	}

}
