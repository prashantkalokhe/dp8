package com.containment;

public class BankArrayDemo {
	int branchCode;
	String bankName;
	String address;
	Account account[];

	public BankArrayDemo() {

	}

	public BankArrayDemo(int branchCode, String bankName, String address, Account account[]) {
		this.branchCode = branchCode;
		this.bankName = bankName;
		this.address = address;
		this.account = account;
	}

	public int getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Account[] getAccount() {
		return account;
	}

	public void setAccount(Account[] account) {
		this.account = account;
	}

	public String toString() {
		return "Bank [branchCode=" + branchCode + ", bankName=" + bankName + ", address=" + address;
	}

	public void printAccount() {
		for (Account a : account)
			System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account accArr[] = new Account[4];
		accArr[0] = new Account(101, "sk", 30000);
		accArr[1] = new Account(102, "pk", 40000);
		accArr[2] = new Account(103, "rk", 50000);
		accArr[3] = new Account(104, "bk", 60000);

		BankArrayDemo obj = new BankArrayDemo(1001, "kondhawa", "pune1", accArr);
		System.out.println(obj);
		obj.printAccount();
	}

}
