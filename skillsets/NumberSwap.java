import java.util.Scanner;

public class NumberSwap
//author: Rachel Hester
{
	public static void main(String[] args) {

		//output statements

		System.out.println("Program swaps two integers.");
		System.out.println("Note: Program checks for integers and non-numeric values.");
		System.out.println();


		//declare some variables
		int temp;
		int num1;
		int num2; 
		Scanner scnr = new Scanner(System.in);

		//enter data
		System.out.print("Please enter first number: ");
		while (!scnr.hasNextInt()) {
			System.out.println("Not a valid integer!");
			scnr.next();
			System.out.println();
			System.out.print("Please try again. Enter first number: ");
		}
		num1 = scnr.nextInt();

		//space
		System.out.println();

		//enter more data
		
		System.out.print("Please enter second number: ");
		while (!scnr.hasNextInt()) {
			System.out.println("Not a valid integer!");
			scnr.next();
			System.out.println();
			System.out.print("Please try again. Enter second number: ");
		}
		num2 = scnr.nextInt();

		//space
		System.out.println();

		//before swapping
		System.out.println("Before Swapping");
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		//space
		System.out.println();

		//swap
		temp = num1;

		num1 = num2;

		num2 = temp;

		//after swapping 
		System.out.println("After Swapping");
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);















	}//end of main


}//end of class