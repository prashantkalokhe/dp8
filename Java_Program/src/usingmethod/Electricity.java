package usingmethod;

public class Electricity {
	int ecustmer_number;
	int eunit,eprice,bill;
	String custmer_name,emonth;
	public void setData( String name, int number,int unit,int price, String month)
	{
		custmer_name=name;
		ecustmer_number= number ;
		eunit=unit;
		eprice=price;
		emonth=month;
	}

	public void calculateBill()
	{
		bill=eunit*eprice;
	}
	public void displayData()
	{
		System.out.println("custmer name is"+ custmer_name);
		System.out.println("custmer number is"+ ecustmer_number);
		System.out.println("custmer unit is"+ eunit);
		System.out.println("custmer price is"+ eprice);
		System.out.println("custmer month is"+ emonth);
		System.out.println("custmer bill amount is"+ bill);


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electricity obj=new Electricity();
		obj.setData("prashant", 123, 50, 5, "may");
		obj.calculateBill();
		obj.displayData();

	}

}
