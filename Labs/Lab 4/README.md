# Lab 4
NEIT Java Class Spring 2017  
HW Labs from class  
  
<b>Problem 1 – Array Manipulation</b>  
Create a class Ledger that will record the sales for a store.  It will have the following attributes:  
•	sale – an array of double values that are the amount of all sales  
•	salesMade – the number of sales so far  
•	maxSales – the maximum number of sales that can be records  
It will have the following methods  
•	Ledger(max) – a constructor that sets the maximum number of sales to the max value  
•	addSale(d) – adds a sale whose value is d  
•	getNumberOfSales – returns the number of sales made  
•	getTotalSales – returns the total value of sales  
•	getAverageSale - returns the average value of all sales  
•	getCountAbove(target) – returns the number of sales that exceeded the target value  
In addition, you are responsible for reasonable error handling in this program – i.e. you should define the program against users that enter things that aren’t logical.  
In your main program, make appropriate calls to prove that your program has met the above specification.  
You should use a constructor for Ledger that sets the sales array in Ledger to a value of 10.  You should only add about 5 sales in the main program.  
An example output is:  
Testing Ledger:   
Adding sales 3.52, 2.43, 9.00, 3.5, 5.0  
The total number of sales are: 5  
The total amount of sales is: 23.45  
The average sale amount is: 4.6899999999999995  
The number of sales greater than 3.5 is: 3  
The number of sales greater than 3.0 is: 4  
  
  
<b>Problem 2 – Exercise 7.23</b>  
  
Note, use a constant for the number of lockers to create the size of the array, counters, etc.  Do not hard code the number 100 in your code.  

A couple of hints  
•	You need to create one array that will store the state of each locker (open or closed).  
•	Ultimately you will need two nested loops (one for the students, and then one for the lockers).  
•	Remember, in a For loop, you can increment by more than one).  
  
Locker 1 is open  
Locker 4 is open  
Locker 9 is open  
Locker 16 is open  
Locker 25 is open  
Locker 36 is open  
Locker 49 is open  
Locker 64 is open  
Locker 81 is open  
Locker 100 is open  
  