import java.util.Scanner;

public class CountCharacter 
//Author: Rachel Hester
{
	public static void main(String[] args) {

	//output statements
		System.out.print("Program counts number and types of characters: that is, letters, spaces, numbers, and other characters.\n");
		System.out.print("Hint: You may find the following methods helpful: isLetter(), isDigit(), isSpaceChar().\n");
		System.out.println("Additionally, you could add the functionality of testing for upper vs lower case letters.\n");
		

	//declare variables
		String test;
		Scanner scnr = new Scanner(System.in);
		int letter = 0;
		int spaces = 0;
		int numbers = 0;
		int other = 0; 

	//please enter string for a test

		System.out.print("Please enter string: ");
		test = scnr.nextLine();
		System.out.println();

	//loop that counts each letter character
		for (int i = 0; i < test.length(); i++) {
			if (Character.isLetter(test.charAt(i))) {
				letter ++;

			}//end of first if 
		else if (Character.isSpaceChar(test.charAt(i))) {
				spaces ++;
		}//end of second if 

	
		else if (Character.isDigit(test.charAt(i))) {
				numbers ++;
		}//end of third if 
	else {
		other ++;

	}//end of else
}//end of loop




	//displays the total number of characters present
		System.out.println("Your string \"" + test + "\" has the following number and types of characters: ");

		System.out.println("letter(s): " + letter);
		System.out.println("space(s): " + spaces);
		System.out.println("number(s): " + numbers);
		System.out.println("other character(s): " + other);


	}//end of main
}//end of class