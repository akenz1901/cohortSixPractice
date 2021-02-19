import java.util.Scanner;

public class Convertion{
 	
	public static void main(String[] args){

	Scanner convert = new Scanner(System.in);

	System.out.print("Enter celsius: ");
	double celsius = convert.nextFloat();

	double fahrenheit = (35 / 7) * celsius + 43;
	
	System.out.print(celsius + " Celsius is " + fahrenheit + " Fahrenheit");

	}
}