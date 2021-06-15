public class FullTimeStaff extends Employees {

	private double Salary;

	public FullTimeStaff(String name, int ID, String dateOfBirth, double Salary) {
		super(name, ID, dateOfBirth);
		this.Salary = Salary;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		this.Salary = salary;
	}

	public String toString() {
		return "Name: " + getName() + "\tID: " + getID() + "\tDate of birth: " + getDateOfBirth() + "\tSalary: " + Salary + "$";
	}

	public double calculateSalary() {
		Salary = Salary - (Salary * TAXRATE);
		return Salary;
	}

}
