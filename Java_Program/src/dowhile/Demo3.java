package dowhile;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int i=1;
		do
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
			i++;
		}while(i<=15);
		System.out.println(sum);

	}

}
