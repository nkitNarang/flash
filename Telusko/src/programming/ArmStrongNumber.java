package programming;

public class ArmStrongNumber {

	public static void main(String[] args) 
	{
	int n=153 ;
	int temp=n;
	int r;
	int sum =0;
	
	
while (n>0) 
{	
	r=n%10;
	n=n/10;
	sum=sum+r*r*r ;
	
	}
if(sum==temp)
	System.out.println(sum+ " - it's an armstrong number");
else 
	System.out.println(sum+ " - Not an armstrong number..");

}
}
