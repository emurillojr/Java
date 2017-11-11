package week1.assignment2;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter three words: ");
		String firstWord = input.nextLine();
		String secondWord = input.nextLine();
		String thirdWord = input.nextLine();

		System.out.println("Concatenated String = " + firstWord + secondWord + thirdWord);

		StringBuffer strBuf = new StringBuffer();
		strBuf.append("StringBuffer = ");
		strBuf.append(firstWord);
		strBuf.append(secondWord);
		strBuf.append(thirdWord);

		System.out.println(strBuf.toString());

		input.close();
	}

}
