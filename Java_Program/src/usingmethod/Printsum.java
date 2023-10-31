package usingmethod;

public class Printsum {

	public void Printsum() {
		// TODO Auto-generated method stub

		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printsum obj = new Printsum();
		obj.Printsum();

	}

}
