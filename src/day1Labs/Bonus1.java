package day1Labs;
import java.util.Scanner;
import java.lang.Integer;
public class Bonus1 {

	public static void main(String[] args) {
		// Welcome message
		System.out.println("Welcome to the Letter Grade Converter!");
		System.out.println();
		
		// Scanner to initialize user input and also check for "Y" loop
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			
			// User inputs a numerical grade
			System.out.println("Enter a numerical grade:   ");
			letterGrades(sc);	
			
			
			
			// Ask if you want to continue
			System.out.println("Continue? (y/n): ");
			choice = sc.nextLine();
			System.out.println();
		}
		sc.close();
		System.out.println("See Ya!");

	}

	public static void letterGrades(Scanner sc) {
		int yourGrade = Integer.parseInt(sc.nextLine());
		String grade;
		
		if (yourGrade >= 88) {
			grade = "A";
		} else if (yourGrade >= 80) {
			grade = "B";
		} else if (yourGrade >= 67) {
			grade = "C";
		} else if (yourGrade >= 60) {
			grade = "D";
		} else { grade = "F";
		}
System.out.println("Letter Grade = " + grade);
	}

}
