package programming;

public class Perfect_Number {

	public static void main(String[] args) {
		int n=11;
		boolean b=isPerfect(n);
		if(b)
			System.out.println("Its Perfect Number");
		else
			System.out.println("Its not");
	}

	public static boolean isPerfect(int n)
	{
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0) 
				sum=sum+i;
			}
			if(n==sum)
			return true;
			
			return false;	
		}
		
		
	}

