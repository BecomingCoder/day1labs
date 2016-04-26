package day1Labs;
import java.util.Scanner;
import java.text.NumberFormat;

/**
 * 
 */

/**
 * @author hus
 *
 */
public class Lab1 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// Welcome message for user
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		System.out.println();
		
		
		String choice = "y";
		
		
		while (choice.equalsIgnoreCase("y")) {
			
			Volume.areaHeightVolume(sc);
			
			
			// Ask if user wants to continue
			System.out.println("Continue? (y/n): ");
			choice = Validation.readYorN("y", "n");
			System.out.println();
		}
		sc.close();
		System.out.println("See Ya!");

	}



}
