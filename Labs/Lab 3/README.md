# Lab 3
NEIT Java Class Spring 2017  
HW Labs from class  

<b>Problem 1 – Room Occupancy</b>  
Create a class called RoomOccupancy that can be used to record the number of people in the rooms of a building.    
The class has the following attributes:  
•	numberInRoom – the number of people in a room  
•	totalNumber – the total number of people in all rooms as a static variable  
The class has the following methods:  
•	addOneToRoom – adds a person to the room and increases the value of totalNumber  
•	removeOneFromRoom – removes a person from the room.  It will not allow the number of people in the room to go negative  
•	getNumber – returns the number of people in the room  
•	getTotal – a static method that returns the total number of people in all rooms.  
  
Test the class to show that the class requirements have been satisfied.  Your class should show the following scenario  
•	Create two rooms.  
•	Add people to both rooms  
•	Subtract people from both rooms – show that you can’t go negative  
•	Print out the total number of people in each room  
•	Print out the total number of people in ALL rooms (NOTE – THIS MUST BE A STATIC CALL)  
  
<b>Problem 2 – Exercise 9.7</b>  
A couple of modifications/hints  
•	You do not need to create UML.  
•	Remember the getMonthlyInterest method is a calculation from the yearly interest rate which is entered.  
•	There does not have to be any console input, you can hardcode the parameters in your main method (for example - account.withdraw(2500))  
•	For the date created, you may use the following call:  
		dateCreated = new java.util.Date();  
	(or use the jre8 call LocalDateTime timePoint = LocalDateTime.now(    );  
  
Sample output:  
Balance is 20500.0  
Monthly interest is 76.875  
This account was created at Sat Aug 02 07:34:34 EDT 2014  
  
<b>Problem 3 – Classes and enumerators</b>  
Consider a class Movie that contains information about a movie.  
The class has the following attributes:  
•	The movie name  
•	The MPAA rating (e.e. G.,PG. PG13,R)  
•	The number of people that have rated this movie as a 1 (Terrible)  
•	The number of people that have rated this movie as a2 (Bad)  
•	The number of people that have rated this movie as a 3 (OK)  
•	The number of people that have rated this movie as a 4 (Good)  
•	The number of people that have rated this movie as a 5 (Great)  
Implement the class with accessors and mutators for the movie name and MPAA rating. Write a method addRating that takes an integer as an input parameter. The method should verify that the parameter is a number between 1 and 5, and if so, increment by one the number of people rating the movie that matches the input parameter. For example, if 3 is the input parameter, then the number of people that rated the movie as a 3 should be incremented by one. Write another method, getAverage, that returns the average value for all of the movie ratings.  
Test the class by writing a main method that creates at least two movie objects, adds at least five ratings for each movie, and outputs the movie name, MPAA rating and average rating for each movie object.  
Note, the MPAA rating is to be implemented as an enumerator.  
Sample Output  

Rio 2, Rated G - Average rating: 2.4  
Guardians Of The Galaxy, Rated PG13 - Average rating: 4.5  
