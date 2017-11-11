package week1.assignment2;

import java.util.Scanner;

public class DriveTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the driving distance: ");
		double miles = input.nextDouble();

		System.out.println("Enter miles per gallon: ");
		double mpg = input.nextDouble();

		System.out.println("Enter price per gallon: ");
		double ppg = input.nextDouble();

		double costOfDriving = ((miles / mpg) * ppg);

		System.out.println("The cost of driving is " + costOfDriving);

		input.close();
	}

}
