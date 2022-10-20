/* Program to input age from user and throw user-defined exception if entered age is negative.
 * 
 * 
 * 
 */




import java.util.Scanner;
class InvalidAgeException extends Exception  //Custom exception block, handling userdefined Exception
{
	InvalidAgeException(String s)
	{
		super(s);
	}
}

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age  :");
		int age = sc.nextInt();
		try {
			if(age<18)
			{
				throw new InvalidAgeException("Invalid age !"); // throw userdefined exception
			}
			else {
				System.out.println("Valid age..");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}

	}

}
