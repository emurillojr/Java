# Lab 2
NEIT Java Class Spring 2017  
HW Labs from class  
  
<b>Problem 1 – Harris-Benedict calculation</b>  
The Harris-Benedict equation estimates the number of calories your body needs to maintain your weight if you do no exercise.  
This is called your basal metabolic rate, or BMR.  
The calories needed for a female to maintain her weight is:  
BMG = 655 + (4.3 x weight in pounds) + (4.7 x height in inches) – (4.7 x age in years)  
The calories needed for a male to maintain his weight is:  
BMG = 66 + (6.3 x weight in pounds) + (12.9 x height in inches) – (6.8 x age in years)  
Write a program that allows the user to input the following information:  
Weight in pounds  
Height in inches  
Age in years  
Sex (“M” or “F”)  
Activity Level (increase the total BMR by the indicated percent)  
-Sedentary – increase by 20 %  
-Somewhat Active (exercise occasionally) – increase by 30%  
-Active (exercise 3-4 days per week) – increase by 40%  
-Highly active (exercise every day) – increase by 50%   
A typical chocolate bar will contain around 230 calories. Output the amount of chocolate bars that should be consumed to maintain one’s weight based on whether the person is a man or a woman – output to two decimal places.  
The only error checking that your program needs to do is to verify that the sex entered is either an “M” or “F”. The program needs to keep asking the user for data until they finally type either an M or F.  
Sample Output 1  
This program will calculate the number of 230 calorie  
candy bars to eat to maintain your weight.  
What is your age in years?  
20  
What is your total height in inches?  
60  
What is your weight in pounds?  
170  
Enter 'M' for male calculation or 'F' for female calculation.  
M  
Are you:  
A. Sedentary  
B. Somewhat active (exercise occasionally)  
C. Active (exercise 3-4 days per week)  
D. Highly active (exercise every day)  
Enter A,B,C, or D.  
b  
A male with those measurements should eat 10.03 candy bars per day to maintain the same weight.  
  
Sample Output 2     
This program will calculate the number of 230 calorie  
candy bars to eat to maintain your weight.  
What is your age in years?  
20  
What is your total height in inches?  
60  
What is your weight in pounds?  
170  
Enter 'M' for male calculation or 'F' for female calculation.  
F  
Are you:  
A. Sedentary  
B. Somewhat active (exercise occasionally)  
C. Active (exercise 3-4 days per week)  
D. Highly active (exercise every day)  
Enter A,B,C, or D.  
B  
A female with those measurements should eat 8.89 candy bars per day to maintain the same weight.  
  
<b>Problem 2 – Sentinel Values</b>  
Write a program that reads a row of integers and determines which is the largest and how many times it occurred.  
When the user enters a 0, the program will output the calculations.  
Note – the input is all on one line, there is no carriage returns between numbers.  
The output should look like the sample below.  
You do not have to check for the validity of the data.  
Sample Output 1  
Enter an integer (0 ends the input): 2 4 4 1 2 4 2 0  
The largest number is 4  
The number 4 appears 3 times  
  
<b>Problem 3 – Determine Fractions</b>  
Write a program that prompts the user to enter the numerator and denominator of a fraction.  
The program determines whether the number is a proper fraction (i.e. less than 1) or an improper fraction.  
If it is a proper fraction, display the number.  
If not, reduce it to a mixed fraction or to an integer.  
The program is to loop until the numerator entered is 0, at that point, the program will output a statement saying that it is exiting.  
All data will be valid.  
  
Sample Output 1  
Enter a numerator: 45  
Enter a denominator: 46  
45 / 46 is a proper fraction  
Sample Output 2  
Enter a numerator: 45  
Enter a denominator: 15  
45 / 15 is an improper fraction and it can be reduced to 3  
Sample Output 3  
Enter a numerator: 45  
Enter a denominator: 25  
45 / 25 is an improper fraction and its mixed fraction is 1 + 20 / 25  
  
Enter a numerator: 0  
program exited  


  
