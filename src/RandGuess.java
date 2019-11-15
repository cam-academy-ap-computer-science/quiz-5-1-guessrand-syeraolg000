
import java.util.*;   
public class RandGuess {

	public static void main(String[] args) {
		int rand = 0;
		boolean success = false;
		Random R = new Random();
		rand = R.nextInt(100) + 1;// Get a random number between 1-100

		while ( success == true) {
			int guess = 0;
			// Instantiate a new Scanner 'console'
			System.out.println("Your Guess: ?");
			Scanner consoleInt;
			String guess = consoleInt.next();
			success =  // call 'compare()' method
		}
	}
	
	// Declare a method named 'compare()' that accepts two parameters 'guess' and 'rand' and returns
	// a boolean.
	public static   
		boolean got_it = false;
		if () {  // Fix if test
			System.out.println("You got it!");
			got_it = true;
		} else if () {  // Fix if test
			System.out.println("No, it's Higher");
		} else {
			System.out.println("No, it's Lower");
		}
		return got_it;
	}
