/**Get input "score" from user in Decimal

Condition Statement
if user input is greater than or equals 40

System shall print "Pass"

if user input is lesser than or equals to 39

System shall print "Failed"**/

import java.util.Scanner;
public class StudentScore{

	public static void main(String[] args){
	Scanner collector = new Scanner(System.in);

	System.out.print("Enter Score: ");
	double score = collector.nextDouble();

	if (score >= 40)
	System.out.print("Pass ");

	if (score <= 39.9999)
	System.out.print("Failed");
	}

}