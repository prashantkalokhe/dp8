package com.inheritance;
import com.interface_.Printable;


public class MyDate implements Printable  {

	private int dd,mm,yy;
	public MyDate()
	{
		System.out.println("i am in default const of mydate");
		dd=17;
		mm=10;
		yy=2023;
	}
	public MyDate(int dd,int mm,int yy)
	{
		System.out.println("parametric const of Mydtae");
		System.out.println("i in parametric const");
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	public void setData(int d,int m,int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
	
	@Override
	public String toString() {
		return "MyDate [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}

    @Override
    public boolean equals(Object obj)
    {
   	 //Object obj=new MyDate();
   	 System.out.println("In equals");
   	 MyDate d=(MyDate)obj;
   	 if(this.dd==d.dd && this.mm==d.mm && this.yy==d.yy)
   		 return true;
   	 else
   		 return false;
   	 
   	 
    }
   
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		final int prime = 31;
		int result = 1;
		result = prime * result + dd;
		
		return result;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("I am in main");
		//Object creation
		MyDate obj=new MyDate(26,10,2023);
		System.out.println(obj);
		
		System.out.println(obj.hashCode());
		MyDate obj1=new MyDate(26,10,2023);		
		System.out.println(obj1.hashCode());
		MyDate obj2=obj1;
		System.out.println(obj2.hashCode());
		System.out.println(obj.equals(obj1));
		
		
		
		
	}
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("I am in show method of MyDate");
	}

}

	
	
	
	
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("i am in main");
		MyDate obj=new MyDate();
		System.out.println("obj");
		obj.setDd(18);
		obj.setMm(12);
		obj.setYy(2023);
		System.out.println(obj);
	}

}
*/