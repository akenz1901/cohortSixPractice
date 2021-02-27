import java.util.Scanner;
public class Kata1{

	public double calculateAverage(int average){
	Scanner collector = new Scanner(System.in);
        average = 0;
        int number;
        int allAveragenumber = 0;
              while (allAveragenumber < 3){
              System.out.print("Enter number: ");
              number = collector.nextInt();
              average = average + number;
              allAveragenumber++;
         }
	return average / 3.0;
	}
	public String calculateGrade(int grade){
	if ( grade >= 90)
	return "A";
	else
	if(grade >= 80)
	return "B";
	else
	if (grade >= 70)
	return "C";
	else
	return "F";
	}
	public boolean isEven(int isItEven){
	if (isItEven %2 == 0)
	return true;
	else
	return false;
	}
	
	public boolean isPrimeNumber(int isItPrimeNumber){
	Scanner collector = new Scanner(System.in);
	System.out.print("Enter Number: ");
	isItPrimeNumber = collector.nextInt();
	int checkNumber = 2;
	while (checkNumber < isItPrimeNumber){
	
	if (isItPrimeNumber % checkNumber == 0){
	return false;
	}
	
	checkNumber++;
	}
	return true;
		
	}

}
