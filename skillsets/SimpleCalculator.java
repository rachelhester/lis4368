import java.util.Scanner;

public class SimpleCalculator {

	public static void main (String[] args) {

		//display operational statements

		System.out.println("Program uses nonvalue-returning methods to add, subtract, multiply, divide, and power floating point numbers, rounded to two decimal places.");
		System.out.println("Note: Program checks for non-numeric values, and division by zero.");

		//declare some variables

		Scanner scnr = new Scanner(System.in);
		double num1 = 0.0;
		double num2 = 0.0;
		String operation = "";

		//first loop statement for operation choice

		System.out.print("Enter mathematical operation (a=add, s=subtract, m=multiply, d=divide, p=power): ");
		operation = scnr.next().toLowerCase();

		while (!operation.equals("a") && !operation.equals("s") && !operation.equals("m") && !operation.equals("d") && !operation.equals("p"))
		{
			System.out.print("\nIncorrect operation. Please enter correct operation: ");
			operation = scnr.next();
		}
		


		//first loop statement for first number 

		System.out.print("Please enter first number: ");
		while (!scnr.hasNextDouble()) 
		{
			System.out.println("Not valid number!");
			scnr.next();
			System.out.print("Please try again. Enter first number: ");
		}
		num1 = scnr.nextDouble();
		System.out.println();

		//second loop statement for second number

		System.out.print("Please enter second number: ");
		while (!scnr.hasNextDouble()) 
		{
			System.out.println("Not valid number!");
			scnr.next();
			System.out.print("Please try again. Enter second number: ");
		}
		num2 = scnr.nextDouble();
		System.out.println();


		//use functions

		if (operation.equals("a")) 
		{
			Add(num1, num2);
		}

		else if (operation.equals("s")) 
		{
			Subtract(num1, num2);
		}

		else if (operation.equals("m")) 
		{
			Multiply(num1, num2);
		}
		else if (operation.equals("d")) 
		{
			//dividing by zero
			if (num2 == 0) {
				System.out.print("Error! You cannot divide by zero.");
			}//end of if 
			else {
				Divide(num1, num2);
			}//end of else 
		}//end of else if 

		else if (operation.equals("p")) 
		{
			Power(num1, num2);
		}//end of last else if 

		System.out.println();


	}//end of main 


		//defining methods 

		public static void Add(double n1, double n2) 
		{
			System.out.print(n1 + " + " + n2 + " = ");
			System.out.printf("%.2f", (n1 + n2));

		}//end

		public static void Subtract(double n1, double n2)
		{
			System.out.print(n1 + " - " + n2 + " = ");
			System.out.printf("%.2f", (n1 - n2));
		}//end

		public static void Multiply(double n1, double n2)
		{
			System.out.print(n1 + " * " + n2 + " = ");
			System.out.printf("%.2f", (n1 * n2));
		}

		public static void Divide(double n1, double n2) 
		{
			System.out.print(n1 + " / " + n2 + " = ");
			System.out.printf("%.2f", (n1 / n2));
		}

		public static void Power(double n1, double n2)
		{
			System.out.print(n1 + " to the power of " + n2 + " = ");
			System.out.printf("%.2f", (Math.pow(n1, n2)));
		}

}//end of class 














	