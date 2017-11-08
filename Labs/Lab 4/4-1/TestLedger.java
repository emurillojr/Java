import java.util.Scanner;

public class TestLedger {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		boolean done = false;
		String choice = ""; // choice a, h, q
		String saleInput = ""; // sales amount being entered
		String salesGreaterThan = ""; // sales greater than amount
		Ledger test = new Ledger(); // create object of Ledger class

		while (!done) { // while done is not true

			System.out.println("Adding sales: (A), Sales greater than: (H), or quit (Q) to display output.\n");
			choice = reader.next().toLowerCase(); // make choice lower case

			if (choice.equals("a")) {

				System.out.println("Enter sale: ");
				saleInput = reader.next();

				// if input is not a number or number is negative amount = invalid
				while (!Ledger.isNumber(saleInput) || Double.parseDouble(saleInput) < 0) {

					System.out.println("Invalid. Please renter sale: ");
					saleInput = reader.next();
				}

				double sale = Double.parseDouble(saleInput); // converts string to double

				try {
					test.addSale(sale); // add it to array
				} catch (IndexOutOfBoundsException e) // max is already set in ledger class
				{
					System.out.println("Sorry, no more sales can be entered.");
				}

			} else if (choice.equals("h")) {

				System.out.println("Enter the amount for sales greater than?");
				salesGreaterThan = reader.next();

				// if input is not a number or number is negative amount = invalid
				while (!Ledger.isNumber(salesGreaterThan) || Double.parseDouble(salesGreaterThan) < 0) {
					// input is not a double or sale is negative -invalid
					System.out.println("Invalid. Please renter amount for sales greater than?: ");
					salesGreaterThan = reader.next();
				}

				double greaterThanAmount = Double.parseDouble(salesGreaterThan); // converts string to double

				try {
					test.addSaleGreatherThan(greaterThanAmount); // add it to array
				} catch (IndexOutOfBoundsException e) // max is already set in ledger class
				{
					System.out.println("Sorry, no more sales greater than amounts can be entered.");
				}

			} else if (choice.equals("q")) {

				if (test.getNumberOfSales() == 0) { // if there are no sales

					System.out.print("There is no output. \nPlease make another choice\n"); // loops back to choices
				} else {
					done = true;

					System.out.print("Testing Ledger: \nAdding Sales ");
					for (int i = 0; i < test.getNumberOfSales(); i++) {
						System.out.print(test.getSale()[i] + ", ");
					}
					System.out.println("\nThe total number of sales are: " + test.getNumberOfSales());
					System.out.println("The total amount of sales is: " + test.getTotalSales());
					System.out.println("The average sale amount is: " + test.getAverageSale());
					for (int j = 0; j < test.getSalesGreaterThanNumber(); j++) {
						System.out.println("The number of sale greater than " + test.getSalesGreaterThan()[j] + " is: "
								+ test.getCountAbove(test.getSalesGreaterThan()[j]));
					}
				}
			} else {
				System.out.println("Unknown command: " + choice);
			}
		} // end of while
		reader.close();
	} // end of main
} // end of class TestLedger
