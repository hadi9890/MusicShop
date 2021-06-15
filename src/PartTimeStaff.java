public class PartTimeStaff extends Employees {

	private int hoursWorked;
	private double hourlyRate = 10.0;
	private double salary;
	

	public PartTimeStaff(String name, int ID, String dateofBirth, int hoursWorked) {
		super(name, ID, dateofBirth);
		this.hoursWorked = hoursWorked;
		
	}
	
	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double calculateSalary() {
		salary = hoursWorked * hourlyRate;
		return salary;	
	} 
	
	public String toString() {
		return "Name: " + getName() + "\tID: " + getID() + "\tDate of birth: " + getDateOfBirth() + "\tSalary: " + calculateSalary() +"$";
	}
}
