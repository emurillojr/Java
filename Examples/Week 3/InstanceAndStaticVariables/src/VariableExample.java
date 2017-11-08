
public class VariableExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesPerson3 firstGuy = new SalesPerson3("Bruce", "ganek");
		SalesPerson3 secondGuy = new SalesPerson3("Mickey", "Mouse");

		System.out.println("First Person's name is " + firstGuy.FirstName + " " + firstGuy.LastName);
		System.out.println("Second Person's name is " + secondGuy.FirstName + " " + secondGuy.LastName);
		System.out.println("First Person's Sales ID = " + firstGuy.salesID);
		System.out.println("Second Person's Sales ID = " + secondGuy.salesID);

		firstGuy.FirstName = "John";
		System.out.println("------------------------------\n\n");
		System.out.println("First Person's name is " + firstGuy.FirstName + " " + firstGuy.LastName);
		System.out.println("Second Person's name is " + secondGuy.FirstName + " " + secondGuy.LastName);
		System.out.println("First Person's Sales ID = " + firstGuy.salesID);
		System.out.println("Second Person's Sales ID = " + secondGuy.salesID);

	}

}
