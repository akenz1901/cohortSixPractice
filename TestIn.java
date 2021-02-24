import java.util.Scanner;
public class TestIn{

	public static void main(String[] args){
	Scanner collector = new Scanner(System.in);
	
	System.out.print("enter input: ");
	double grade = collector.nextDouble();

	if (grade >= 60){
	System.out.println("Passed");
	}
	
	else{
	System.out.println("Failed");
	System.out.println("You must take this course again");
	}
 }

}