
public class SalesPerson3 {
	private static int numberOfSalesPeople = 0;
	
	public String FirstName;
	public String LastName;
	public int salesID;
	
	public SalesPerson3(){
		FirstName = "";
		LastName = "";
		salesID = ++numberOfSalesPeople;
	}
	
	public SalesPerson3(String SalesFirstName,String SalesLastName){
		FirstName = SalesFirstName;
		LastName = SalesLastName;
		salesID = ++numberOfSalesPeople;
	}
}
