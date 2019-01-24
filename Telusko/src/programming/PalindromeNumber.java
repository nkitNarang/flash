package programming;

public class PalindromeNumber {

	public static void main(String[] args) {
	   int n=151;
	   int temp=n;
	   int r;
	   int sum=0;
	   
	   
	while(n>0) {  
	  r = n%10;
	  n=n/10;
	  sum=sum*10+r;
	   

	}
	if(temp==sum)
	System.out.println(temp+" - It's an PalingDrome");
	else
		System.out.println(temp +" - Not an PalingDrome");
	}
}
