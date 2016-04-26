package day1Labs;

public class Validation {
	
	public static float readValidFloat() {
		while (!Lab1.sc.hasNextFloat()) {
			Lab1.sc.nextLine();
			System.out.print("Please enter a valid number: ");
		}
		float x = Lab1.sc.nextFloat();
		Lab1.sc.nextLine();
		return x;
	}

	// Validates that input is within the range you set.  Will need to be called in main.
	public static float getValidFloat(float min, float max) {
		float i = readValidFloat();
		while (i < min || i > max) {
			System.out.print("Please put a number within range! (1 - 200,000): ");  // this can be changed to needed values
			i = readValidFloat();
		}
		return i;
	}
	
	public static String readYorN(String x, String y) {
		String z = Lab1.sc.nextLine();

		while (!(z.equalsIgnoreCase(x) || z.equalsIgnoreCase(y))) {
			System.out.print("Invalid option, use 'y' or 'n': ");
			z = Lab1.sc.nextLine();
		}
		return z;
	}

}
