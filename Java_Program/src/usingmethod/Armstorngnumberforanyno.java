package usingmethod;

public class Armstorngnumberforanyno {
	public int digitcount(int num) {
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

	public int power(int b, int e) {
		int power = 1;
		for (int i = 0; i < e; i++) {
			power=power*b;
			
		}
		return power;
	}
		public boolean checkArmstrong(int num)
		{
			int cnt=digitcount(num);
			System.out.println("Digit count is"+ cnt);
			int sum=0;
			int temp=num;
			while(num!=0)
			{
				int rem=num%10;
				sum=sum+power(rem,cnt);
				System.out.println("p of"+rem+"is"+""+ sum);
				num=num/10;
				
			}
			if(sum==temp)
				return true;
			else
				return false;
		
		

	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armstorngnumberforanyno obj=new Armstorngnumberforanyno();
	
		if(obj.checkArmstrong(1634))
			System.out.println("Number is armstrong number");
		else
			System.out.println("Number is not armstrong number");


	}


}
