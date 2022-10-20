import java.util.Scanner;

/* 
Java Program to accept 2 numbers from console by using Scanner?
Print sum, Difference,product, Quotient, Remainder?
Apply Arithmetic Exception Division by Zero: Print "Invalid Division".
String parsed to a numeric variable : Print "Format mismatch".

*/

public class Problem1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter n1 value :");
	int n1 = sc.nextInt();
	System.out.print("Enter n2 value :");
	int n2 = sc.nextInt();
	int sum =0, difference =0, product =0, quotient =0,remainder =0;
	boolean flag = false;
	try {
	 sum = n1+n2;
	 System.out.println("Sum : "+sum);

	 difference = n1-n2;
	 System.out.println("Dif : "+difference);
	 product = n1*n2;
	 System.out.println("Pro : "+product);
	 try {
	 quotient = n1/n2; 
	 remainder = n1%n2;
	 }
	 catch(Exception e)
	 {
		 System.out.println("Invalid division \nInvalid Remainder");
		 flag = true;
	 }
	 
	
	 
	
	
	 if(!flag)
	 {
	
	 System.out.println("Quo : "+quotient);
	 System.out.println("Rem : "+remainder);
	 }

	}
	catch(Exception e)
	{
		System.out.println("Format mismatch");
	}
	
	}

}
