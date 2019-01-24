package programming;

import java.util.Scanner;

public class String_1st_Program {

	public static void main(String[] args) 
	{
  String s1,s2;
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter The Two String");
        s1= sc.nextLine();
        s2=sc.nextLine();
 //Step 1       
  int l1 = s1.length();
  int l2 = s2.length();
  
  System.out.println("String 1st Length is "+ l1);
  System.out.println("String 2st Length is "+ l2);
		
  //Step 2
 // String s3 = s1+s2;
  String s4 = s1.concat(s2);
  System.out.println("two String Concat is " + s4);
  
  //Step 3
  String uperCase = s1.toUpperCase();
  System.out.println("S1 upper case is " + uperCase);
	}

}
