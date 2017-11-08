
public class EqualsWithObjects {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesPerson2 firstGuy = new SalesPerson2("Bruce", "Ganek");
		SalesPerson2 secondGuy = new SalesPerson2("Bruce", "Ganek");

		if (firstGuy == secondGuy) {
			System.out.println("The two people are equal");
		} else
			System.out.println("The two people are not equal");

		if (firstGuy.equals(secondGuy)) {
			System.out.println("The two people are equal");
		} else
			System.out.println("The two people are not equal");
	}

}
