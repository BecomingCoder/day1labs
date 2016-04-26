package day1Labs;

import java.text.NumberFormat;
import java.util.Scanner;

public class Volume {
	
	public static void areaHeightVolume(Scanner sc) {
		float theLength;
		float theWidth;
		float theHeight;
		
		// User inputs Length
		System.out.println("Enter Length:    ");
		theLength = Float.parseFloat(sc.nextLine());
		
		// User inputs Width
		System.out.println("Enter Width:    ");
		theWidth = Float.parseFloat(sc.nextLine());
		
		// User inputs Height
		System.out.println("Enter Height:    ");
		theHeight = Float.parseFloat(sc.nextLine());
		
		// Calculate Area
		float theArea = 2 * (theLength * theWidth);
		
		// Calculate Perimeter
		float thePerimeter = theLength * theWidth;
		
		// Calculate Volume
		float theVolume = theLength * theWidth * theHeight;
		
		
		// Formatting the output to display only 2 digits
		NumberFormat formatValue = NumberFormat.getInstance();
		formatValue.setMaximumFractionDigits(2);
		
		// Setting the formatted variables to replace user input variables
		String formatArea = formatValue.format(theArea);
		String formatPerimeter = formatValue.format(thePerimeter);
		String formatVolume = formatValue.format(theVolume);

		
		// Display the Area, Perimeter & Volume to user
		System.out.println("Area:    " + formatArea);
		System.out.println("Perimeter:    " + formatPerimeter);
		System.out.println("Volume:       " + formatVolume);
	}

}
