public class EmployeeTest{

	public static void main(String... args){

	double monthlySalary = 2000;
	double yearlySalary = monthlySalary*12;
	double percentage = 0.1;
	double tenpercent = yearlySalary*percentage;
	double total = yearlySalary+tenpercent; 
	Employee newEmployeeName = new Employee("John", "Ayuba", yearlySalary);
	
	double monthlySalary2 = 3000;
	double yearlySalary2 = monthlySalary2*12;
	double percentage2 = 0.1;
	double tenpercent2 = yearlySalary2*percentage2;
	double total2 = yearlySalary2+tenpercent2;
	Employee newEmployeeName2 = new Employee("Elon Musk", "MyDaddy", yearlySalary2);
	
	
	System.out.printf("The First Employee Full Name is %s %s%nyearly Salary is $%.2f%n", 
	newEmployeeName.getFirstName(), newEmployeeName.getLastName(), newEmployeeName.getMonthlySalary());
	System.out.printf("First Employee 10percent yearly Salary is $%s with the percentage his total salary is $%s%n%n", tenpercent, total);
	
	

	System.out.printf("The Second Employee Full Name is %s %s%nyearly Salary is $%.2f%n", 
	newEmployeeName2.getFirstName(), newEmployeeName2.getLastName(), newEmployeeName2.getMonthlySalary());
	System.out.printf("Second Employee 10percent yearly Salary is $%s with the percentage his total salary is $%s%n%n",+ tenpercent2, total2);

	}
}