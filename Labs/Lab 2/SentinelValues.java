import java.util.Scanner;

public class SentinelValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number;
		int maxNumber;
		int counter = 0;

		System.out.println("Enter an interger (0 ends the input): ");
		number = input.nextInt();
		maxNumber = number;

		do{
			number = input.nextInt();
			if (number > maxNumber){
				maxNumber = number;
				counter = 1;
			}
				else if (number == maxNumber){
				counter++;
				}
	
		}while (number != 0);
		
			System.out.print("The largest number is " + maxNumber + "\n");
			System.out.print("The number " + maxNumber + " appears " + counter + " times");
			input.close();
	}
}
