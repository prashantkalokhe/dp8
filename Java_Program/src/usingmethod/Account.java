package usingmethod;

import java.util.Scanner;

public class Account {

	long ac_number;
	double account_balance, deposite_amount, withdraw_amount;
	String account_name, branch_name, ifsc_code;

	public void setData(String name, String branch, long number, String ifsc, double balance) {
		ac_number = number;
		account_name = name;
		branch_name = branch;
		ifsc_code = ifsc;
		account_balance = balance;
	}

	public void depositeamount(int amount1) {
		deposite_amount = account_balance + amount1;
	}

	public void withdraw_amount(int amount2) {
		withdraw_amount = account_balance - amount2;
	}

	public void display() {
		System.out.println("Enter the ac_number" + ac_number);
		System.out.println("Enter the account_name" + account_name);
		System.out.println("Enter the branch_name" + branch_name);
		System.out.println("Enter the ifsc_code" + ifsc_code);
		System.out.println("Enter the account_balance" + account_balance);
		System.out.println("Enter the Depositamount" + deposite_amount);
		System.out.println("Enter the withdraw_amount" + withdraw_amount);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ente the amount1");
		int amount1 = sc.nextInt();
		System.out.println("ente the amount2");
		int amount2 = sc.nextInt();
		Account obj = new Account();
		obj.setData("prashant", "panoli", 1003l, "PUNS0023", 20000);
		obj.depositeamount(amount1);
		obj.withdraw_amount(amount2);

		obj.display();

	}

}
