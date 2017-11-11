package week1.assignment1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first number: ");
		double firstNumber = input.nextDouble();

		System.out.println("Enter the second number: ");
		double secondNumber = input.nextDouble();

		double resultd = (firstNumber * secondNumber);
		int resulti = (int) (firstNumber * secondNumber);

		System.out.println("double result = " + resultd);
		System.out.println("int result = " + resulti);

		input.close();
	}

}
