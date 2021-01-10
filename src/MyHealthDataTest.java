import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Algonquin College CST8284 (Lab 301)  Assignment 3
 * The test class MyHealthDataTest contains main method that prompts patient's information, and it will print the information for the patient object
 * @author Yicong (Daniel) Zhang (40991538)
 * @version 1.0
 * @since 1.0
 */
public class MyHealthDataTest {
	/**
	 * The main method uses Scanner input to ask patient's information and instantiates patient object and print patient's information
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to the Electronic Health Records (EHR) system");
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your first name: ");
		String firstname = input.nextLine();
		
		System.out.print("Please enter your Last name: ");
		String lastname = input.nextLine();
		
		System.out.print("Please enter your gender: ");
		String gender = input.nextLine();
		
		System.out.print("Please enter your height (inches): ");
		double height = input.nextDouble();
		
		System.out.print("Please enter your weight (pounds): ");
		double weight = input.nextDouble();
		
		/**
		 * Here,  to be more professional, I use the combination of do-while loop and at try catch block to validate user's input
		 * The do-while loop will only pass(in this case, invalidBirthyear = false) if the input not throwing InputMismatchException and bigger than 0
		 * So that means, if the input is smaller than 0 the program will keep asking the user to enter again
		 * If the user enter a double input (eg.1996.4) the try block will throw an InputMismatchException which will be caught by the catch block and ask the user to enter again
		 */
		int birthyear = 0;
		boolean invalidBirthyear = true;
		do {
			try {
				System.out.print("Please enter your birth year: ");
				birthyear = input.nextInt();
				invalidBirthyear = false; //It will only pass the while loop if the input not throwing InputMismatchException and bigger than 0
				if (birthyear < 0) {
					invalidBirthyear = true;
					System.out.print("Invalid! your birth year must be > 0. Try again! \n");
				}
			}
			catch (InputMismatchException e) {
				System.out.println("Invalid birth year: your input must be an integer! Try again!");
				input.nextLine();
			}	
		} while (invalidBirthyear);
		
		/**
		 * Same as above, except I add one more else-if condition to validate/make sure the current year the user entered is bigger than birth year
		 */
		int currentyear = 0;
		boolean invalidCurrentyear = true;
		do {
			try {
				System.out.print("Please enter your current year: ");
				currentyear = input.nextInt();
				invalidCurrentyear = false; //It will only pass the while loop if the input not throwing InputMismatchException, bigger than 0 and bigger than birth year
				if (currentyear < 0) {
					invalidCurrentyear = true;
					System.out.print("Invalid! current year must be > 0. Try again! \n");
				}
				else if (birthyear > currentyear) {
					invalidCurrentyear = true;
					System.out.print("Invalid! Are you come from the future? Try again! \n");
				}
			
			}
			catch (InputMismatchException e) {
				System.out.println("Invalid current year: your input must be an integer! ! Try again!");
				input.nextLine();
			}	
		} while (invalidCurrentyear);
		
		/**
		 * Instantiating an object patient using the above validated Scanner inputs and calls the print method to display the information
		 */
		MyHealthData patient = new MyHealthData(firstname, lastname, gender, height, weight, birthyear, currentyear);
		patient.displayMyHealthData();
	}
}
