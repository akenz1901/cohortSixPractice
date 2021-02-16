import java.util.Scanner;

public class TryingOut{

	public static void main(String[] args){

		Scanner asker = new Scanner(System.in);

		System.out.print("Enter First figure: ");
		int firstNumber = asker.nextInt();

		System.out.print("Enter Second figure: ");	
		int secondNumber = asker.nextInt();

		if (firstNumber == secondNumber)
		System.out.println("First Number is equals to Second Number");

		if (firstNumber != secondNumber)
		System.out.println("First Number is not equals to Second Number");

		if (firstNumber < secondNumber)
		System.out.println("First Number less than Second Number");

		if (firstNumber > secondNumber)
		System.out.println("First Number greater than Second Number");

		if (firstNumber <= secondNumber)
		System.out.println("First Number less than or equals to Second Number");

		if (firstNumber >= secondNumber)
		System.out.println("First Number greater than or equals to Second Number");
}


}