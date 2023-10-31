package usingmethod;

//5,9,17,29,45,65
public class Series6 {
	public void Numberseries(int a) {
		int b = 5;
		System.out.println(b);
		for (int i = 1; i <= 10; i++) {
			int c = b + (i * 4);
			b = c;
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Series6 obj = new Series6();
		obj.Numberseries(6);

	}

}
