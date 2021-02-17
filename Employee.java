public class Employee{

	private String firstName;
	private String lastName;
	private double monthlySalary;

	public Employee(String firstName, String lastName, double monthlySalary){
	
	this.firstName = firstName;


	this.lastName = lastName;

	if (monthlySalary > 0.0)
	this.monthlySalary = monthlySalary;

	}
	
	public void setFirstName(String employeeName){

	firstName = employeeName;

	}

	public String getFirstName(){
	
	return firstName;
	}

	public void setLastName(String employeeLastName){

	lastName = employeeLastName;
	}

	public String getLastName(){
	
	return lastName;
	}	

	public void setMonthlySalary(double employeeSalary){
	
	if (employeeSalary > 0.0)
	monthlySalary = employeeSalary;
	
	}

	public double getMonthlySalary(){

	return monthlySalary;
	
	}
}