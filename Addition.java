import java.util.Scanner;

public class Addition{


	public static void main(String[] args){

		Scanner collector = new Scanner(System.in);

		
	
		System.out.print("Enter First number: ");
		int number1 = collector.nextInt();
		
		System.out.print("Enter Second number: ");
		int number2 = collector.nextInt();

		int result  = number1 + number2;
		
		System.out.printf("Result is %d%n ", result);
	   
}






}