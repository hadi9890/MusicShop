
public class Employees extends ShopRecords {

	private String name;
	private int ID;
	private String dateOfBirth;

	public Employees(String name, int ID, String dateOfBirth) {
		super();
		this.name = name;
		this.ID = ID;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String toString() {
		return "Name: " + name + "\tID: " + ID + "\tDate of birth: " + dateOfBirth;
	}

	public double calculateSalary() {

		return 0;
	}

}
