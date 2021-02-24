import java.util.Scanner;
public class Flipper{


	public static void main(String... args){
	
	Scanner collector = new Scanner(System.in);

	int input1;
	int input2;
	int input3;
	System.out.print("Enter your input: ");
	input1 = collector.nextInt();
	System.out.print("Enter your input: ");
	input2 = collector.nextInt();
	System.out.print("Enter your input: ");
	input3 = collector.nextInt();

	if (input1 == input2)
	System.out.println("It is palindrome");

	else
    	System.out.println("it is not palindrome ");







}




}