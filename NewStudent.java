import java.util.Scanner;
public class NewStudent{

	public static void main(String... args){

	Scanner collector = new Scanner(System.in);

	double score;

	System.out.print("Enter Score: ");
	score = collector.nextDouble();

	if(score >= 0 && score <= 100)
		
	if (score >= 90)
	System.out.println("A");
	
	else
	if (score >= 80 )
	System.out.println("B");
	
	else
	if (score >= 70)
	System.out.println("C");
	
	else
	if(score < 70)
	System.out.println("F");

	else
	System.out.print("Invalid");

	 
}
}