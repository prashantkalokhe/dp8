package com.containment;

public class Topic {
	int tid;
	String tname;
	SubTopic st;

	public Topic() {

	}

	public Topic(int tid, String tname, SubTopic st) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.st = st;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public SubTopic getSt() {
		return st;
	}

	public void setSt(SubTopic st) {
		this.st = st;
	}

	@Override
	public String toString() {
		return "\nTopic tid=" + tid + ", tname=" + tname + " " + st;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// SubTopic st1=new Subtopic()
		Topic tp = new Topic();
		System.out.println(tp);
	}

}
