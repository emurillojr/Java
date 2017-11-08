
public class SalesPerson2 {
	private static int numberOfSalesPeople = 0;

	public String FirstName;
	public String LastName;
	public int salesID;

	public SalesPerson2() {
		FirstName = "";
		LastName = "";
		salesID = ++numberOfSalesPeople;
	}

	public SalesPerson2(String SalesFirstName, String SalesLastName) {
		FirstName = SalesFirstName;
		LastName = SalesLastName;
		salesID = ++numberOfSalesPeople;
	}

	public boolean equals(SalesPerson2 target) {
		if (this.FirstName.equals(target.FirstName) && (this.LastName.equals(target.LastName)))
			return true;
		else
			return false;
	}

}
