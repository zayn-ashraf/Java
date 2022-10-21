import java.util.Scanner;

/*
 * 
 * Define a class Student with four data members such as name
 * rollno, sub1 and sub2. 
 * Define appropriate methods to initialize and display the values of data members.
 * Aslo calculate total marks and percentage scored by student.
 * 
 * */

public class Problem3 {
	String name;
	int rollno;
	int sub1;
	int sub2;
	
	
	Problem3(String name, int rollno, int sub1, int sub2){
		this.name = name;
		this.rollno = rollno;
		this.sub1 = sub1;
		this.sub2 = sub2;
	}
	float total()
	{
		return sub1+sub2;
	}
	float percentage()
	{
		return (sub1+sub2)/2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name  :");
		String name = sc.next();
		System.out.print("Enter rollno  :");
		int rollno = sc.nextInt();
		System.out.print("Enter sub1  :");
		int sub1 = sc.nextInt();
		System.out.print("Enter sub2  :");
		int sub2 = sc.nextInt();
		Problem3 p = new Problem3(name,rollno, sub1, sub2);
		
		float tot = p.total();
		float per = p.percentage();
		System.out.println("name  : "+name+"\nrollno : "+rollno+"\nsub1 : "+sub1+"\nsub2 : "+sub2+"\ntot : "+tot+"\nper : "+per);
		
		
		

	}

}
