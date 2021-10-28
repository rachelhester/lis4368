import java.io.*;
import java.util.Scanner; 

public class FileWriteReadCountWords 
	{
		public static void main(String[] args) {

//output statements
System.out.println("Program captures user input, writes to and reads from same file, and counts number of wordss in file.");
System.out.println("Hint: use hasNext() method to read number of words (tokens).");
System.out.println();


//create myFile string object to create text file

String myFile = "filecountwords.txt";

try {
	//make file
	File file = new File(myFile);

	//printwriter object
	PrintWriter writer = new PrintWriter(file);


	//delare some variables: scanner object and string to test
	Scanner scnr = new Scanner(System.in);
	String test = "";


	//enter text statement and store variable input in string test
	System.out.print("Please enter text: ");
	test = scnr.nextLine();

	//write to the file using the PrintWriter
	writer.write(test);

	//output statement
	System.out.println("Saved to file \"" + myFile + "\"");

	//close the writer output file
	writer.close();

	//hasNext() method using a new Scanner to read
	Scanner read = new Scanner(new FileInputStream(file));

	//declare variable for loop
	int count = 0;
	while (read.hasNext())
	{
		read.next();
		count++;
	}//end of loop

	//output statement
	System.out.println("Number of words: " + count);
		
}//end of try 

//to catch any errors with the file (find, write, etc.)
catch(IOException ex) {
	System.out.println("Error writing to file " + myFile + "");




}//end of catch

	}//end of main 

}//end of class
