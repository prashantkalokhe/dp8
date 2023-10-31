package usingmethod;

public class Demo9oct {
	int eid;
	String ename, desg, dname, addr, email;
	long contactNum;
	double sal;
	boolean fullTimeStatus;

	public void setData(int id, String name, String d, String dnm, String adr, String e, long cnum, double s,
			boolean status) {
		System.out.println("in setDate()");
		eid = id;
		ename = name;
		desg = d;
		dname = dnm;
		addr = adr;
		email = e;
		contactNum = cnum;
		sal = s;
		fullTimeStatus = status;

	}

	public void display() {
		System.out.println("Employeeid id is" + eid);
		System.out.println("Employeeid name is" + ename);
		System.out.println("Employeeid designation is" + desg);
		System.out.println("Employeeid department is" + dname);
		System.out.println("Employeeid Address is" + addr);
		System.out.println("Employeeid Email is" + email);
		System.out.println("Employeeid contact number is" + contactNum);
		System.out.println("Employeeid id Salary is" + sal);
		System.out.println("Employeeid id full time status is" + fullTimeStatus);

	}

	public static void main(String[] args) {
		Demo9oct obj = new Demo9oct();
		obj.setData(1, "Prashant", "Hr","develper", "Pune", "klokheprashant@gmail.com", 788543434l, 7686.89, true);
		obj.display();
	}

}
