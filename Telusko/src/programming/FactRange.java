package programming;

import java.util.Scanner;

public class FactRange {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the value");
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n;i++)
		{
			long fact=1;
			for(int j=1;j<=i;j++) 
			{
				fact=fact*j;
				
			}
			System.out.print(fact +" ");
		}

	}

}
