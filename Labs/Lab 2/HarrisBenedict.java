import java.util.Scanner;
import java.text.DecimalFormat;

public class HarrisBenedict {

	private static DecimalFormat df1 = new DecimalFormat(".##");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		double BMG;
		double candyBars;
		String sex = "";
		String activity = "";

		System.out.print("This program will calculate the number of 230 calorie  \n");
		System.out.print("candy bars to eat to maintain your weight. \n");
		System.out.print("What is your age is years? \n");
		int age = input.nextInt();
		System.out.print("What is your total height in inches? \n");
		int height = input.nextInt();
		System.out.print("What is your weight in pounds? \n");
		int weight = input.nextInt();
		input.nextLine();

		System.out.print("Enter \'M\' for male calculation or \'F\' for female calculation. \n");
		sex = input.nextLine().toUpperCase();

		while (!sex.equals("M") && !sex.equals("F")) {
			System.out.print("Invalid \n");
			System.out.print("Enter \'M\' for male calculation or \'F\' for female calculation. \n");
			sex = input.nextLine().toUpperCase();
		}
		;

		if (sex.equals("M")) {
			BMG = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
			sex = "male";
		} else {
			BMG = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
			sex = "female";
		}

		System.out.print("Are you: \n");
		System.out.print("A. Sedentary \n");
		System.out.print("B. Somewhat active (excercise occasionally) \n");
		System.out.print("C. Active (excercise 3-4 days per week)\n");
		System.out.print("D. Highly active (excercise every day)\n");
		System.out.print("Enter A, B, C, or D \n");
		activity = input.nextLine().toUpperCase();

		while (!activity.equals("A") && !activity.equals("B") && !activity.equals("C") && !activity.equals("D")) {
			System.out.print("Invalid \n");
			System.out.print("Enter A, B, C, or D \n");
			activity = input.nextLine().toUpperCase();
		}
		;

		switch (activity) {
		case "A":
			BMG = BMG * 1.20;
			break;
		case "B":
			BMG = BMG * 1.30;
			break;
		case "C":
			BMG = BMG * 1.40;
			break;
		case "D":
			BMG = BMG * 1.50;
			break;
		default:
			System.out.print("Enter A, B, C, D \n");
		}

		candyBars = BMG / 230;

		System.out.print("A " + sex + " with those measurements should eat " + df1.format(candyBars)
				+ " candy bars per day to maintain the " + "same weight.");

		// closes Scanner
		input.close();
	}
}
