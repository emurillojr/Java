

public class Ledger {
	private final static int MAXSALES_SIZE = 10;
	private final static int GREATERTHAN_SIZE = 5;  // added
	private double[] sale;  // array amount of all sales
	private int salesMade; // number of sales so far
	private int maxSales; // max number of sales that can be records
	// added
	private double[] salesGreaterThan; // amount for sales greater than
	private int greaterThanCounter; // number of sales greater than number so far
	
	
	public double[] getSalesGreaterThan() {
		return salesGreaterThan;
	}

	public void setSalesGreaterThan(double[] salesGreaterThan) {
		this.salesGreaterThan = salesGreaterThan;
	}

	public double[] getSale() {
		return sale;
	}

	public void setSale(double[] sale) {
		this.sale = sale;
	}

	public int getSalesMade() {
		return salesMade;
	}

	public void setSalesMade(int salesMade) {
		this.salesMade = salesMade;
	}

	public int getMaxSales() {
		return maxSales;
	}

	public void setMaxSales(int maxSales) {
		this.maxSales = maxSales;
	}

	// default constructor
	public Ledger(){
		sale = new double[MAXSALES_SIZE];
		salesGreaterThan  = new double[GREATERTHAN_SIZE];  //added
		salesMade = 0;
		maxSales = 0;
	}
	
	// constructor that sets max number of sales to the max value
	public Ledger(int max){
		maxSales = max;
		sale = new double[max];
	}
	
	// adds a sale whose value is d
	public void addSale(double d){
		sale[salesMade] = d;
		salesMade++; // increments 
	}
	
	// adds a sale whose value is d
	public void addSaleGreatherThan(double d){
		salesGreaterThan[greaterThanCounter] = d;
			greaterThanCounter++; // increments 
		}
	
	// returns number of sales made
	public int getNumberOfSales(){
		return salesMade;
	}
	
	// returns number of mumber of sales greater than
		public int getSalesGreaterThanNumber(){
			return greaterThanCounter;
		}
		
	// returns total values of sales
	public double getTotalSales(){
		double totalSales = 0.00;
		for (int i = 0; i < salesMade; i++) { // loop thru number of sales
			totalSales += sale[i];  // go thru each sale array index and add to totalSales
		}
		return totalSales;
	}
	
	// returns the average value of all sales
	public double getAverageSale(){
		double averageSale = getTotalSales() / salesMade;
		return averageSale;
	}
	
	// returns the number of sales that exceeded the target value
	public int getCountAbove(double target)  {
		int counter = 0;  // need counter to get number of times
		for (int i = 0; i < salesMade; i++) {	// loop thru number of sales
			if (sale[i] > target) // if sale array amount is greater than target
				counter++; // add to counter
		}
		return counter;
	}
	
	
    // function to test NumberFormatException and to confirm valid input
	public static boolean isNumber(String s) {
		try {
			double addingSales = Double.parseDouble(s);
		} catch (NumberFormatException ex) {
		return false;
			}
		return true;
	}
}
