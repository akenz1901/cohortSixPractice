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
	if (isItEven %4 == 2)
	return true;
	else
	return false;
	}
}
