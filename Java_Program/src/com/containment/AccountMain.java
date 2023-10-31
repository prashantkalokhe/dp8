package com.containment;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// array of account object
		Account accArr[] = new Account[3];
		accArr[0] = new Account(101, "sk", 89000);
		accArr[1] = new Account(102, "pk", 65000);
		accArr[2] = new Account(103, "rk", 45000);

		for (int i = 0; i < accArr.length; i++)
			System.out.println(accArr[i]);

		System.out.println();
		System.out.println();
		// or

		for (Account a : accArr)
			System.out.println(a);

		double max = 0;
		String name = " ";
		for (Account a1 : accArr) {
			if (a1.getBalance() > max) {
				max = a1.getBalance();
				name = a1.getName();
			}
		}

		System.out.println(name + " is having maximimum balance rs " + max);
	}

}
