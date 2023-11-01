package Array;


	public class Sumofevenarray {
		public int sumOfEven(int a[]) {
			int sum = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] % 2 == 0)

					sum = sum + a[i];
			}
			return sum;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int arr[]= {12,53,65,41,4};
			Sumofevenarray obj=new Sumofevenarray();
			int res=obj.sumOfEven(arr);
			System.out.println(res);
		}

	}
