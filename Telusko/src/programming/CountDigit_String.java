package programming;

import java.util.Scanner;

public class CountDigit_String {

	public static void main(String[] args) {
		
		//Scanner sc= new Scanner(System.in);
		
		//System.out.println("Enter the String");
	
		
		//String str=sc.nextLine();
		
		String str="ishu123sharma456";
		int counter=0;
		
		for(int i=0 ; i<str.length();i++)
		{
			char charter=str.charAt(i);
			//System.out.print(charter);
			
			if ( charter>=48 && charter<=57)
				
				counter++;
		}
		
System.out.println("Total no. of digit in string : " + counter);
	}

}
