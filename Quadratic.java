import java.util.Scanner;

public class Quadratic{

	public static void main(String... args){
	Scanner collector = new Scanner(System.in);

	double d;
	double x1;
	double x2;
	
	System.out.print("Enter Figure a: ");
	double a = collector.nextDouble();
	
	System.out.print("Enter Figure b: ");
	double b = collector.nextDouble();
	
	System.out.print("Enter Figure c: ");
	double c = collector.nextDouble();

	d = b * b - 4 * a * c;
	
	System.out.println("The roots of D are " + d);

	if (d > 0.0){
	x1 = (-b + Math.sqrt(d)/2*a);
	x2 = (-b + Math.sqrt(d)/2*a);
	System.out.printf("The roots of Equation are %d%n and %d%n",x1 , x2);
	}
	else if	(d < 0 || d == 0){
	
	x1 = (-b)/2*a;
	System.out.println("The root is " + x1);
 	}

	else{
	System.out.println(" None of the Root are real then");
	
	}

	}


}