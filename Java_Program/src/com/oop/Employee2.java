package com.oop;
//toString

public class Employee2 {
  static int count=0;
  private int id;
  private String name;
  private float salary;
  
  Employee2(){
    this.id=++count;
  }
  public Employee2(String name,float salary)
  {
    this();
    this.name=name;
    this.salary=salary;
    
  }
  public String toString()
  {
    return "Id is "+id+" name is "+name+" salary is "+salary;
  }
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    Employee2 obj=new Employee2("prashant",789454f);
    Employee2 obj1=new Employee2("ishwar",677575f);
    Employee2 obj2=new Employee2("rushikesh",457454f);
    
     System.out.println(obj);
     System.out.println(obj1);
     System.out.println(obj2);
    
    
  }

}