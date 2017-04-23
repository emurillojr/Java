import java.util.Scanner;

public class DetermineFractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numerator;
		int denominator;
		int wholeNumber;
		int remainder;
		
		System.out.println("Enter a numerator: ");
		numerator = input.nextInt();
		if (numerator == 0){
			System.out.println("program exited");
				
		}
	
		else{
		do{
			System.out.println("Enter a denominator: ");
			denominator = input.nextInt();
			break;	
		}while (numerator != 0);

		wholeNumber = numerator / denominator;
		remainder = numerator % denominator;
		
		//works all the time
		if (wholeNumber == 0 && remainder == numerator)
		{
			System.out.println(numerator + " / " + denominator + " is a proper fraction");
		}
		
		//just in case 
		else if (wholeNumber <= 0)
		{
			System.out.println(numerator + " / " + denominator + " is a proper fraction");
		}
		
		
		else if (wholeNumber > 0 && remainder == 0)
		{
			System.out.println(numerator + " / " + denominator + " is an improper fraction and it can be reduced to " + wholeNumber);
		}
		
		else if (wholeNumber > 0 && remainder > 0)
		{
			System.out.println(numerator + " / " + denominator + " is an improper fraction and its mixed fraction is " + wholeNumber + " + " + remainder + " / " + denominator);
		}
		
		else{
			System.out.println("Error:  Something went totally wrong.");
		}
		
		//used for testing****
		//System.out.println(wholeNumber);
		//System.out.println(remainder);
		}
		input.close();
	}
}
