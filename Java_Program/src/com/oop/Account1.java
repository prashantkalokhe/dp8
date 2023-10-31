package com.oop;

public class Account1 {

	public static double intRate;
	private int accno;
	private String OwnerName;
	private double balance;

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getOwnerName() {
		return OwnerName;
	}

	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
/*
	public void SetData(int acno, String on, double bal) 
		{
			acno=accno;
			on=OwnerName;
			bal=balance;
		}
		*/
	public void printAccount()
	{
		System.out.println("Account is"+accno+" ");
		System.out.println("OwnerName is"+OwnerName);
		System.out.println("balance is" +balance);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account1 obj=new Account1();
		obj.setAccno(23);
		obj.setOwnerName("pk");
		obj.setBalance(676767564);
		//obj.printAccount();
		obj.printAccount();
		
		

	}

}
