package com.containment;
/* Create Employee class which has attributes (id, name, salary, dept,
mydate). Where dept and mydate is class, dept has (dept_id, dept_name)
And mydate has (day, month, year).
Display Employee information.
Note. Containment using constructor and getter/setter

*/
public class SubTopic {
	int sid;
	String sname;
	Question que1;
	
	
	
	public SubTopic() {
		}


	public SubTopic(int sid, String sname,Question que1) {
		
		this.sid = sid;
		this.sname = sname;
		this.que1=que1;
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public Question getQue1() {
		return que1;
	}


	public void setQue1(Question que1) {
		this.que1 = que1;
	}


	@Override
	public String toString() {
		return "\nSubTopic sid=" + sid + ", sname=" + sname + " "+que1;
	}


	public static void main(String[] args) {


		//Question que1=new Question(02,"Ask me");
		SubTopic st=new SubTopic();
		System.out.println(st);

	}


}
