import java.io.PrintStream;
import java.util.Scanner;

public class TextInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 	// this means create a new Scanner object and set it to monitor the System.in stream for input.
							// System.in represents the current istream being used by the system. Typically, it means your keyboard.
		System.out.println("Input a line of text:"); 	// this asks the user for a line of text
		String input = scan.nextLine(); 		// this then captures everything until the user hits enter
								// now the text is stored in the variable input
		input = input.toLowerCase(); 	// this line converts the text to all lower case. for example, it would make "CATS" into "cats"
						// we use this for the comparison in the next line
		if (input.equals("cats")) {
			System.out.println("You typed cats!");	// here we checked to see if the user typed "cats". the .equals() method is case sensitive, so we had to make sure that both were lowercase.
		}
		else if (input.equals("dogs")) {
			System.out.println("You typed dogs!"); 	// here we looked and found dogs. notice that you can combine else and if to form an "else if" statement
		}
		else {
			System.out.println("You typed " + input);	// since the .equals() method showed us that input wasn't "cats" or "dogs", so just show it to the user instead
		}
		scan.close(); 	// make sure you close the scanner afterward. cleaning up is always good
	}
}
