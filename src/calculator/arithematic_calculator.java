package calculator;

import java.util.Scanner;

class cal
{
	public void Division() {
		int a,b,c;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the values of a and b :)");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a/b;
		long d = c;
		float z = d;
		System.out.println("Division = "+z);
	}

	public void multiplication() {
		int a,b,c;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the values of a and b :)");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a*b;
		long d = c;
		float z = d;
		System.out.println("Multiplication = "+z);
	}

	public void subtraction() {
		int a,b,c;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the values of a and b :)");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a-b;
		long d = c;
		float z = d;
		System.out.println("Subtraction = "+z);
		
	}

	public void addition() {
		int a,b,c;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the values of a and b :)");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		long d = c;
		float z = d;
		System.out.println("Addition = "+z);
	}
}
public class arithematic_calculator {
	
	final static String Developername = "Shriharireddy K";
	final static String Projectname = "Arithematic Calculator";
	final static String welcomescreen = "***** Welcome to "+Projectname+" Developed by "+Developername+" *****";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		char choice='y';
		cal obj = new cal();
		Scanner sc = new Scanner (System.in);
		do
		{
			System.out.println(welcomescreen);
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division\n");
			System.out.println("Enter the choice :)");
			num = sc.nextInt();
			switch(num)
			{
			case 1: obj.addition();
					break;
			case 2: obj.subtraction();
				 	break;
			case 3: obj.multiplication();
					break;
			case 4: obj.Division();
					break;
			default: System.out.println("Incorrect choice entered :( !!!");
					break;
			}
			System.out.println("Do want to continue (y/n):- ");
			choice=sc.next().charAt(0);
		}while(choice == 'y');
		
		System.out.println("Good Bye");
	}
}
