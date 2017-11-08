import java.util.Scanner;

public class Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();

		System.out.print("Enter x2 and y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		// updated
		/*
		 * double firstResult = x2 - x1; double secondResult = y2 - y1; double xResult =
		 * firstResult * firstResult; double yResult = secondResult * secondResult;
		 * double xyResult = xResult + yResult;
		 */

		double result = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
		double answer = Math.sqrt(result);
		// or double answer = Math.pow(result, 0.5); from book - same as above
		System.out.print("The distance of the two points is " + answer);

		input.close();
	}
}
