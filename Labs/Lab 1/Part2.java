import java.util.Scanner;

public class Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a line of text. No punctuation please. \n");
		String sentence = input.nextLine();
		// .trim to remove spaces at beginning and end if any
		sentence = sentence.trim();

		System.out.print("I have rephrased that line to read: \n");

		// grab first letter of the first word of entered sentence and changes it to
		// Uppercase
		String capFirstLetter = sentence.substring(0, 1).toUpperCase();

		// put new capLetter with rest of sentence starting from index 1 till end of
		// sentence
		String updatedSentence = capFirstLetter + sentence.substring(1, sentence.length());

		// find the first space after the first word.
		int firstSpace = updatedSentence.indexOf(' ');

		// grabs from index 0 to space aka first word
		String firstWord = updatedSentence.substring(0, firstSpace);

		// grabs everything after the first space aka rest of sentence, .trim to remove
		// space at beginning
		String restOfSentence = updatedSentence.substring(firstSpace).trim();

		// grab first letter of the new first word and changes it to Uppercase
		String capNewFirstLetter = restOfSentence.substring(0, 1).toUpperCase();

		// put new capLetter with rest of sentence starting from index 1 till end of
		// sentence
		String newSentence = capNewFirstLetter + restOfSentence.substring(1, restOfSentence.length());

		System.out.print(newSentence + " " + firstWord);

		// closes Scanner
		input.close();
	}
}
