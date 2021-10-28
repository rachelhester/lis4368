import java.util.Scanner;

public class LargestThreeNumbers {

	public static void main(String[] args) {

		

		//output statements

		System.out.println("Program evaluates largest of three integers.");
		System.out.println("Note: Program checks for integers and non-numeric values.");


		//declare some variables
		int num1, num2, num3;
		Scanner scnr = new Scanner(System.in);

		//enter data
		System.out.print("Please enter first number: ");
		while (!scnr.hasNextInt()) {
			System.out.println("Not valid integer!");
			scnr.next();
			System.out.print("Please try again. Enter first number: ");
		}
		num1 = scnr.nextInt();
		System.out.println();

		//enter more data

		System.out.print("Please enter second number: ");
		while (!scnr.hasNextInt()) {
			System.out.println("Not valid integer!");
			scnr.next();
			System.out.print("Please try again. Enter second number: ");
		}
		num2 = scnr.nextInt();
		System.out.println();


		System.out.print("Please enter third number: ");
		while (!scnr.hasNextInt()) {
			System.out.println("Not valid integer!");
			scnr.next();
			System.out.print("Please try again. Enter third number: ");
		}
		num3 = scnr.nextInt();
		System.out.println();


		if (num1 > num2 && num1 > num3) {
			System.out.println("First number is largest.");
		}//end of first if

		else if (num2 > num1 && num2 > num3) {
			System.out.println("Second number is largest.");
		}//end of second if 

		else if (num3 > num2 && num3 > num1) {
			System.out.println("Third number is largest.");
		}
		
		else if (num1 == num2 && num3 > num1) {
			System.out.println("Third number is largest.");
		}

		else if (num1 == num2 && num3 < num1) {
			System.out.println("First and second number are largest.");
		}

		else if (num3 == num1 && num2 > num1) {
			System.out.println("Second number is largest.");

		}
		else if (num3 == num1 && num2 < num1) {
			System.out.println("First and third number are largest.");
		}

		else if (num2 == num3 && num1 > num2) {
			System.out.println("First number is largest.");
		}

		else if (num2 == num3 && num1 < num2) {
			System.out.println("Second and third number are largest.");
		}
		
		else {
			System.out.println("They are the same number.");
		}

		



	}//end of main 
}//end of class 