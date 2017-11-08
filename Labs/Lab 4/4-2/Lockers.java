
public class Lockers {

	public static void main(String[] args) {

		final int NUMBEROFLOCKERS = 101; // constant for the number of lockers 0-100

		boolean[] locker = new boolean[NUMBEROFLOCKERS]; // boolean array for lockers
		// initially all lockers are closed = false

		// first student S1 opens every single locker
		for (int i = 1; i < locker.length; i++)
			locker[i] = true; // opened all 100 lockers

		// S2 closes every other locker starting at locker 2
		for (int i = 2; i < locker.length; i += 2)
			locker[i] = false; // closes 2, 4, 6, 8...

		// rest of students starting with 3rd student and so on
		for (int i = 3; i < locker.length; i++) {
			for (int j = 1; j < locker.length; j++) {
				if (j % i == 0) // anything that has a remainder of 0,
					locker[j] = !locker[j]; // if its open, close it or if its closed, open it
			}
		}

		// output
		for (int i = 1; i < locker.length; i++) {
			if (locker[i]) // if locker is true/open
				System.out.print("Locker " + i + " is open\n");
		}
	}
}
