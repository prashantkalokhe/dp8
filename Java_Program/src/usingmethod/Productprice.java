
package usingmethod;

public class Productprice {
	int eid,quantity;
	String pname,pdisc,pcategory;
	float price_unit,discount,totalprice,totaldiscount,discountedprice;
	public void setData(int id,String name,String dis,String catag,float disc,float priceunit,int quant)
	{
		eid=id;
		pname=name;
		pcategory=catag;
		discount=disc;
		price_unit=priceunit;
		quantity=quant;
		
	}
	public void calculateToalPrice() {
		totalprice=price_unit*quantity;
	}
	public void calculateDiscount() {
		totaldiscount=totalprice*(discount/100);
	}
	public void calculateDiscountedPrice() {
		discountedprice=totalprice-totaldiscount;
	}
	public void displayData() {
		System.out.println("product 10"+ eid);
		System.out.println("product Name"+ pname);
		System.out.println("product Discount"+ pdisc);	
		System.out.println("product category"+ pcategory);
		System.out.println("product price per unit"+ price_unit);
		System.out.println("product initial price"+ totalprice);
		System.out.println("product Discount"+ discount);
		System.out.println("product discounted price 10"+ discountedprice);
		System.out.println("_______________________________");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Productprice obj1=new Productprice();
		obj1.setData(1,"Sugar","ghee","cold drink",10,150,30);
		obj1.calculateToalPrice();
		obj1.calculateDiscount();
		obj1.calculateDiscountedPrice();
		obj1.displayData();
		
		/*Productprice obj2=new Productprice();
		obj2.setData(2,"Orange","graphs","tomato",80,150,20);
		obj2.calculateToalPrice();
		obj2.calculateDiscount();
		obj2.calculateDiscountedPrice();
		obj2.displayData();
		*/

	}

}
