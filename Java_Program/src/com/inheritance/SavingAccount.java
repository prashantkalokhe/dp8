package com.inheritance;


public class SavingAccount {
	int AccountNo;
	String AccName;
	double balance ;
	
	public SavingAccount()
	{
		AccountNo=0;
		AccName=" ";
		balance=0;
	}
	public SavingAccount(int AccountNo,String  AccName,double balance)
	{
		this.AccountNo=AccountNo;
		this .AccName=AccName;
		this.balance=balance;
		
	}
	public int getAccountNo() {
		return AccountNo;
	}
	public void setAccountNo(int accountNo) {
		AccountNo = accountNo;
	}
	public String getAccName() {
		return AccName;
	}
	public void setAccName(String accName) {
		AccName = accName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	@Override
	public String toString() {
		return "SavingAccount [AccountNo=" + AccountNo + ", AccName=" + AccName + ", balance=" + balance + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount obj=new SavingAccount(23,"ish",5000);
		
		System.out.println(obj);
	}
}
