package com.containment;

public class Subject {

	int sbid;
	String sbname;
	Topic tp1;

	public Subject() {

	}

	public Subject(int sbid, String sbname, Topic tp1) {
		super();
		this.sbid = sbid;
		this.sbname = sbname;
		this.tp1 = tp1;
	}

	public int getSbid() {
		return sbid;
	}

	public void setSbid(int sbid) {
		this.sbid = sbid;
	}

	public String getSbname() {
		return sbname;
	}

	public void setSbname(String sbname) {
		this.sbname = sbname;
	}

	public Topic getTp1() {
		return tp1;
	}

	public void setTp1(Topic tp1) {
		this.tp1 = tp1;
	}

	@Override
	public String toString() {
		return "\nSubject sbid=" + sbid + ", sbname=" + sbname + "  " + tp1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Subject sub = new Subject();
		System.out.println(sub);
	}

}
