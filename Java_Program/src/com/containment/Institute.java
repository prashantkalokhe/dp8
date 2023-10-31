package com.containment;

public class Institute {

	int Iid;
	String Iname;
	Branch br1;
	public Institute() {
		
	};
	public Institute(int Iid,String Iname,Branch br1) {
		this.Iid=Iid;
		this.Iname=Iname;
		this.br1=br1;
	}
	
	@Override
	public String toString() {
		return "Institute Iid=" + Iid + ", Iname=" + Iname + " Branch :"+br1;
	}
	
	public int getIid() {
		return Iid;
	}
	public void setIid(int iid) {
		Iid = iid;
	}
	public String getIname() {
		return Iname;
	}
	public void setIname(String iname) {
		Iname = iname;
	}
	
	public Branch getBr1() {
		return br1;
	}
	public void setBr1(Branch br1) {
		this.br1 = br1;
	}
	public static void main(String[] args) {


		//Institute ins=new Institute();
		//System.out.println(ins);
		//Branch br2=new Branch(111111,"ENTC");
		
		Question que1=new Question(001,"Que1");
		SubTopic st=new SubTopic(0001,"SDLC",que1);
		Topic tp1=new Topic(00001,"computer system",st);
		Subject sub=new Subject(203,"toc",tp1);
		Branch br1=new Branch(2003,"Computer ",sub);
		
		Institute ins1=new Institute(001," JSPM",br1);
		System.out.println(ins1);

	}
	

}
