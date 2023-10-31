package usingmethod;

//2,3,5,7,11,13,17,19,23,29,31,.....
public class Series4 {
	public void prime(int num) {

		for (int i = 2; i <= num; i++) {
			int count = 0;
			
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					count = 1;
			}
			if (count == 0)
				System.out.println(i);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Series4 obj = new Series4();
		obj.prime(40);

	}
}
