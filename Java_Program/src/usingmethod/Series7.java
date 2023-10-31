package usingmethod;

public class Series7 {
	public void frequency(int num)
	{int result;
	int rem=0;
	for (int i = 0; i <= 9; i++)
	{
		int temp= num;
		result=0;
		while(temp!=0) {
			 rem=num%10;
			 if(i==rem) {
				 result++;
			 }
			
			
		}
		
	}
	

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Series7 obj = new Series7();
		obj.frequency(122334);

	}

}
