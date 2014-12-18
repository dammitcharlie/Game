import java.util.Scanner;
import java.util.ArrayList;
import java.io.Console;

public class Hangman
{
	public static void main(String[] args) {
        String executioner_name;
        String executee_name;
        char[] word; //the word being played
        int total_tries; //the total number of tries that the executionee is allowed
        Console cnsl = System.console(); //we will call readPassword() on this object to read user input without that input being shown
        ArrayList<Character> attempted_letters = new ArrayList<Character>(); //list 
        
        Scanner user_input = new Scanner(System.in);
		System.out.println("Welcome to Hangman.\n");
		System.out.print("Enter name of the executioner: ");
		executioner_name = user_input.next();

		System.out.print("Enter name of the executee: ");
		executee_name = user_input.next();

		System.out.println();

        System.out.print("Enter the amount of tries the hangee is permitted: ");
        total_tries = Integer.parseInt(user_input.next());

		System.out.print(executioner_name + ", type the word you wish to play with: ");
        word = cnsl.readPassword();

        
		
	}
}
