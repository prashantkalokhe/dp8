package com.containment;

public class Bank {
	int branchCode;
	String bankName;
	String address;
	Account account;

	public Bank() {

	}

	public Bank(int branchCode, String bankName, String address, Account account) {
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

	public String getBankname() {
		return bankName;
	}

	public void setBankname(String bankname) {
		this.bankName = bankname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String toString() {
		return "Bank [branchCode=" + branchCode + ", bankName=" + bankName + ", address=" + address + ", account="
				+ account + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank obj = new Bank();
		System.err.println(obj);
		// Account ac=new Account(712,377447,"sk");
		Bank obj1 = new Bank(1001, "katraj", "pune", new Account(101, "ram", 88000));
		System.out.println(obj1);

	}

}
