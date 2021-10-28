import java.util.Scanner;

public class Ascii {

	public static void main (String[] args) {

//declare variables

		int num = 0;
		boolean isValidNum = false;
		Scanner scnr = new Scanner(System.in);

//outprint statement

		System.out.println("Printing characters A-Z as ASCII values:");

		//for loop to print out characters A-Z as ASCII values
		for (char character = 'A'; character <= 'Z'; character++) {

			System.out.printf("Character %c has ascii value %d\n", character, ((int)character));

		}//end of loop 

		//ASCII values 48-22
		System.out.println("\nPrinting ASCII values 48-122 as characters:");
		//start of loop 
		for (num=48; num<=122; num++) {
			System.out.printf("ASCII value %d has character value %c\n", num, ((char) num));
		}//end of loop
		//User input 

		System.out.println("\nAllowing user ASCII value input:");

		while (isValidNum == false) {
			System.out.print("Please enter ASCII value (32- 127); ");
			if (scnr.hasNextInt()) {

				num = scnr.nextInt();
				isValidNum = true;
			}//end of if 
			else {
				System.out.println("Invalid integer -- ASCII value must be a number.\n");
			}//end of else

			scnr.nextLine(); //discards data entered on line 

		//if statements to check num data true and check num range
			if (isValidNum == true && num < 32 || num > 127) {
				System.out.println("ASCII value must be >= 32 and <=127.\n");
				isValidNum = false;
			}//end of if 

			if (isValidNum == true) {
				System.out.println();

				//outputs results
				System.out.printf("ASCII value %d has character value %c\n", num, ((char)num));
			}//end of if 

		}//end of while loop






	}//end of main 



}//end of class