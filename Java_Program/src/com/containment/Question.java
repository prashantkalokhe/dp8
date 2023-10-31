package com.containment;
/*
 2. WAP to use containment for following hierarchy. Fill all data and print all
data: (id is a integer number, name is a String)
Class Institute:id,name
Branch:id,name
Subject:id,name
Topic:id,name
SubTopic:id,name
Question:id,name
 */
public class Question {
	int qid;
	String qname;
	
	public Question() {
		
	}
	public Question(int qid, String qname) {
		
		this.qid = qid;
		this.qname = qname;
	}

	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	@Override
	public String toString() {
		return "\nQuestion qid=" + qid + ", qname=" + qname + "]";
	}
	public static void main(String[] args) {

		Question que=new Question();
		System.out.println(que);


	}


}
