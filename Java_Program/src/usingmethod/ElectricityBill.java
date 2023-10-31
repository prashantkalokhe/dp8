package usingmethod;

import java.util.Scanner;

public class ElectricityBill {
	String meterNo, custmerId, custmerName, custmerEmail, Month, mobileNo;
	double unit, bill, totalbill;

	public void setData(String metNo, String Id, String Name, String Email, String month, String mobile) {
		meterNo = metNo;
		custmerId = Id;
		custmerName = Name;
		custmerEmail = Email;
		Month = month;
		mobileNo = mobile;
	}

	public void Calculatebill(double unit) {
		if (unit <= 50) {
			bill = unit * 3;
			System.out.println("Total bill is" + bill);
		} else if (unit <= 100) {
			bill = (50 * 3) + (5 * (unit - 50));
			System.out.println("Total bill is" + bill);
		}
		else if (unit<=150) {
			bill=(50*3)+(5*50)+(7*(unit-100));
			System.out.println("Total bill is" + bill);
	}
		else if (unit>150) {
			bill = (50 * 3) + (5 * 50) + (7 * 50) + (10 * (unit - 150));
			System.out.println("Total bill is" + bill);
		}
	}
public void display() {
	System.out.println("Enter meter no " + meterNo);
	System.out.println("Enter custmer id no " + custmerId);
	System.out.println("Enter custmerName  " + custmerName);
	System.out.println("Enter custmerEmail " + custmerEmail);
	System.out.println("Enter Month  " + Month);
	//System.out.println("Enter bill " + bill);
	System.out.println("Enter mobileNo " + mobileNo);


	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ente the number of units");
		int unit = sc.nextInt();
		ElectricityBill obj= new ElectricityBill();
		obj.setData("a_23","12","prash","kal@gmail.com","may","87378487");
		obj.Calculatebill(unit);
		obj.display();
		
		

	}

}
