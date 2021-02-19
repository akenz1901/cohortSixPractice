import java.util.Scanner;

public class DateTest{

	public static void main(String[] args){
	Scanner collector = new Scanner(System.in);

	int theMonth;
	int theDay;
	int theYear;
	
	
	System.out.print("Enter month in Figure: ");
	theMonth = collector.nextInt();
	System.out.println();

	System.out.print("Enter day in Figure: ");
	theDay = collector.nextInt();
	System.out.println();
	
	System.out.print("Enter year: ");
	theYear = collector.nextInt();
	
	Date displayDate = new Date(theMonth, theDay, theYear);

	System.out.printf("The Date is %s/%s/%s%n", displayDate.getMonth(), displayDate.getDay(), displayDate.getYear());



	}	


}