package Array;

//write a student class which has rollno,name,percentage ,grade and array of int for marks
public class StudentwithArray {
	int rollno;
	String name;
	double percentage;
	char grade;
	int marks;
	StudentwithArray()
	{
		
	}
	StudentwithArray(int rollno, String name,int marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks=marks;
	}

	public void calPercentage(int a[])
	{
		int sum=0;
		for (int i = 0; i < a.length; i++) {
				sum = sum + a[i];
		}
		percentage=sum/5;
		
	}
	public String toString()
	{
		return rollno+" "+name+" "+marks+" ";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 65, 85, 45, 52, 65 };

	}

}
