package usingmethod;

public class FindFactorial {
	public int calculateFactorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindFactorial obj=new FindFactorial();
		int res=obj.calculateFactorial(5);
		System.out.println(res);

	}

}
