package week1.day1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		//int r,sum=0,temp;    
		//int number=1221;//It is the number variable to be checked for palindrome  

		//temp=number;
		//while(number>0){    
			//r=number%10;  //getting remainder 
			//sum=(sum*10)+r;
			//number=number/10;   

		//}  
		//System.out.println(number);
		//if(temp==sum)    
			//System.out.println("palindrome number ");    
		//else    
			//System.out.println("not palindrome");  
		//StringPalindrome();
		//Datatypes();
		Table();
	}  


	public static void StringPalindrome()
	{
		String str, rev = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string:");
		str = sc.nextLine();

		int length = str.length();

		for ( int i = length - 1; i >= 0; i-- )
			rev = rev + str.charAt(i);

		if (str.equals(rev))
			System.out.println(str+" is a palindrome");
		else
			System.out.println(str+" is not a palindrome");

	}
	public static void Datatypes()
	{	 
	    System.out.println("Size of byte: " + (Byte.MAX_VALUE) + " bytes.");
	    System.out.println("Size of short: " + (Short.MAX_VALUE) + " bytes.");
	    System.out.println("Size of int: " + (Integer.MAX_VALUE) + " bytes.");
	    System.out.println("Size of long: " + (Long.MAX_VALUE) + " bytes.");
	    System.out.println("Size of char: " + (Character.MAX_VALUE) + " bytes.");
	    System.out.println("Size of float: " + (Float.MAX_VALUE) + " bytes.");
	    System.out.println("Size of double: " + (Double.MAX_VALUE) + " bytes.");
	
	}
	public static void Table()
	{
		int n = 0,i=1,a;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		a = sc.nextInt();
				for ( i= 1 ; i <= 20; i++ )
		{					
					n=i*a;
					System.out.println(i+" * "+a+" = "+ i*a);
					
		}
				
			}
}





