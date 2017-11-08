import java.util.*;

public class LinkedLists {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the data now.");
		System.out.println("On each line enter a stadium name and the game revenue");
		System.out.println("Enter done when finished");

		String name;
		double amount;
		boolean good = true;
		double totals = 0;
		LinkedList<String> stadiumNames = new LinkedList<String>();
		LinkedList<Double> gameRevenue = new LinkedList<Double>();

		while (good) {
			name = keyboard.next();
			if (name.equals("done")) {
				good = false;
				break;
			}
			amount = keyboard.nextDouble();

			stadiumNames.add(name);
			gameRevenue.addLast(amount);

		}

		System.out.println("Enter the name of a stadium to get the total revenue for:");
		name = keyboard.next();

		for (int i = 0; i < stadiumNames.size(); i++) {
			if (name.equals(stadiumNames.get(i))) {
				totals += gameRevenue.get(i);

			}

		}

		System.out.println("The total revenue is " + totals);
	}

}
