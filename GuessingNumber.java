import java.util.Scanner;

public class GuessingNumber{

	public static void main(String[] args){
		
		Scanner weytin = new Scanner(System.in);
		
		int guessNumber = 25;
		int number;

		System.out.print("Enter Guess Number: ");
		number = weytin.nextInt();

		if (guessNumber > number)
		System.out.println("Try again");

		if (guessNumber == number)
		System.out.println("This number is coorect");

		if (guessNumber < number)
		System.out.printf(" It's too Less, The correct number is %s ", guessNumber );
		

}
}