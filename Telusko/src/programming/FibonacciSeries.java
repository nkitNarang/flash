package programming;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		
		int last = 50;
		int result=0;
		int a=0;
		int b=1;
		
		System.out.print( a+" "+ b+" ");
		while (result<=n)
		{ 
			
			result=a+b;
		     a=b;
		     b=result;
		    System.out.print(result + " ");
		}
		

	}

}
