package usingmethod;

public class Studentpercentage {
	int eid;
	String ename,email;
	double basicsal,pf,da,hra,netsal;
	public void setData(int id,String name,String mail,double basic)
	{
		eid=id;
		ename=name;
		email=mail;
		basicsal=basic;
		
	}
	public void findpf()
	{
		pf=basicsal*0.10;
		System.out.println("pf of a Employee is" + pf);

	}
	public void findhra()
	{
		hra=basicsal*0.15;
		System.out.println("hra of a Employee is" + hra);
	}
	public void findda()
	{
		 da=basicsal*0.20;
		System.out.println("hra of a Employee is" + da);
	}
	public void netsal()
	{
		netsal=basicsal-pf+da+hra;
		System.out.println("hra of a Employee is" + netsal);
	}
	void display()
	{
			System.out.println("id of a Employee is" + eid);
			System.out.println("name of a Employee is" + ename);
			System.out.println("email of a Employee is" + email);
			System.out.println("basic salary of a Employee is" + basicsal);		
			System.out.println("PF of a Employee is" + pf);
			System.out.println("hra of a Employee is" + hra);
			System.out.println("da of a Employee is" + da);
			System.out.println("netsal of a Employee is" + netsal);
			
//,double pf,double da,double hra,double netsal
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentpercentage obj=new Studentpercentage();
		obj.setData(1,"prashant","klokhepeash@gmail.com",15000);
		obj.findpf();
		obj.findda();
		obj.findhra();
		obj.netsal();
		obj.display();

	}

}
