package usingmethod;

public class Student3 {

	int sid, marathi, english, math, history, hindi;
	String sname, email, grade;
	long contact, month;
	double percentage;

	public void percentage() {
		percentage = (marathi + english + math + history + hindi) / 5;
	}

	public void setData(int id, int mar, int eng, int m, int his, int hin, long cnt, String name, String e) {
		sid = id;
		marathi = mar;
		english = eng;
		math = m;
		history = his;
		hindi = hin;
		contact = cnt;
		sname = name;
		email = e;
	}

	public void disply() {
		System.out.println("Employeeid id is" + sid);
		System.out.println("Employeeid subject is" + marathi);
		System.out.println("Employeeid english is" + english);
		System.out.println("Employeeid math is" + math);
		System.out.println("Employeeid history is" + history);
		System.out.println("Employeeid hindi is" + hindi);
		System.out.println("Employeeid percentage is" + contact);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		obj.setData(23, 68, 89, 68, 89, 78, 778667756, "prash", "k@gmail.com ");
		obj.percentage();

		obj.disply();

	}

}
