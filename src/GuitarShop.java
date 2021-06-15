import java.util.ArrayList;

public class GuitarShop {

	ArrayList<Guitars> guitars ;
	ArrayList<Employees> employees ;

	
	
	public GuitarShop(ArrayList<Guitars> guitars, ArrayList<Employees> employees) {
		
		this.guitars = guitars;
		this.employees = employees;
	}
	

	public void addGuitar(Guitars guitar) {
		guitars.add(guitar);
	}
	
	public void removeGuitar(Guitars guitar) {
		guitars.remove(guitar);
	}
	
	public void addEmployee(Employees employee) {
		employees.add(employee);
	}
	
	public void removeEmployee(Employees employee) {
		employees.remove(employee);
	}

	public ArrayList<Guitars> getAllGuitars() {
		return guitars;
	}

	public void setGuitars(ArrayList<Guitars> guitars) {
		this.guitars = guitars;
	}

	public ArrayList<Employees> getAllEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employees> employees) {
		this.employees = employees;
	}
	
	public Employees getPersonByID(int ID) {
		for(int i =0; i < employees.size() ; i++) {
			if(employees.get(i).getID() == ID) {
				return employees.get(i);
			}
		}
		 return null;
		
	}
	
	public Guitars getGuitarBySerialNum(String serialNumber) {
		for (int i = 0; i < guitars.size(); i++) {
			if(guitars.get(i).getSerialNumber().equals(serialNumber)) {
				return guitars.get(i);
			}
			
		}
		return null;
		
	}
	
	public Boolean hasEmployee(String name) {
		for(int i =0; i< employees.size(); i++) {
			if(employees.get(i).getName().equalsIgnoreCase(name)) {
				return true;
			}
		}
		return false;
	}
	
	public void sortEmployeesByName(){
		
		for(int i = 0; i< employees.size()-1; i++) {
			for(int j=1; j< employees.size()-i; j++) {
				if((employees.get(j-1).getName().compareTo(employees.get(j).getName())>0)) {
					Employees temp = employees.get(j-1);
					employees.set(j-1, employees.get(j));
					employees.set(j, temp);
					
				}
			}
			
		}
	}
	
	public ArrayList<Guitars> sortGuitarsByPrices(){
	
		for(int i = 0; i< guitars.size()-1; i++) {
			for(int j=1; j< guitars.size()-i; j++) {
				if(guitars.get(j-1).getPrice() > guitars.get(j).getPrice()) {
					Guitars temp = guitars.get(j-1);
					guitars.set(j-1, guitars.get(j));
					guitars.set(j, temp);
					
				}
			}
			
		}
		return guitars;
	}
	
	public int searchEmployeesByName(String name) {
		for(int i =0; i< employees.size(); i++) {
			if(employees.get(i).getName().equalsIgnoreCase(name)) {
				return i;
			}
		}
		return -1;
	}
	
	public int searchEmployeesByID(int ID) {
		
		for(int i = 0; i<employees.size(); i++) {
			if(employees.get(i).getID() == ID) {
				return i;
			}
		}
		return -1;
	}
	
	public void printAll() {
		System.out.println("Guitars:");
		for(int i=0; i< guitars.size(); i++) {
		System.out.println(guitars.get(i).toString());
		}
		System.out.println();
		System.out.println("Employees:");
		for(int i=0; i< employees.size(); i++) {
			System.out.println(employees.get(i).toString());
			}
	}
	
}
