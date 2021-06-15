import java.util.ArrayList;

public class GuitarShopTester {
	public static void main(String args[]) {
		
		ArrayList <Guitars> guitar = new ArrayList<Guitars>();
		ArrayList <Employees> emp = new ArrayList<Employees>();
		
		GuitarShop gs = new GuitarShop(guitar, emp);
		
		Guitars guitar1 = new Guitars("Stratocaster", "Fender", "Sunburst", 540, "xST9onea", true);
		Guitars guitar2 = new Guitars("Telecaster", "Fender", "Pink", 499, "b7TEH3pQ", true);
		Guitars guitar3 = new Guitars("Bass", "Ibanez", "pacific blue", 1699, "tb8NczYF", false);
		Guitars guitar4 = new Guitars("Classical", "Yamaha", "Spruce", 150, "ppkNWL3W", true);
		Guitars guitar5 = new Guitars("Acoustic", "Epiphone", "Ebony", 149, "kPsYfxtn", false);
		Guitars guitar6 = new Guitars("Ukelele", "Kala", "Mahogany", 200, "r2Ni4qLJ", false);
		Guitars guitar7 = new Guitars("Classical", "Karl Schneider", "black", 100, "KS1945q6", false);
		
		gs.addGuitar(guitar1);
		gs.addGuitar(guitar2);
		gs.addGuitar(guitar3);
		gs.addGuitar(guitar4);
		gs.addGuitar(guitar5);
		gs.addGuitar(guitar6);
		gs.addGuitar(guitar7);
		
		
		Employees emp1 = new PartTimeStaff("Tia Chebli", 201901852, "10-02-2002", 60);
		Employees emp2 = new PartTimeStaff("Hadi Chamli", 201904707, "01-12-2001", 75);
		Employees emp3 = new FullTimeStaff("Ahmad Chehab", 198723644, "22-09-1987", 6000);
		Employees emp4 = new FullTimeStaff("Sara Bitar", 199602894, "29-2-1996", 5500);
		
		gs.addEmployee(emp1);
		gs.addEmployee(emp2);
		gs.addEmployee(emp3);
		gs.addEmployee(emp4);
		
		gs.printAll();
		System.out.println();
		
		System.out.println("Deleting Kala Ukelele");
		gs.removeGuitar(guitar6);
		System.out.println();
		
		gs.getAllGuitars();
		gs.getAllEmployees();
		
		System.out.println("Calculating Tia Chebli's salary:");
		System.out.println(emp1.calculateSalary());
		System.out.println();
		
		System.out.println("Searching for ID(201904707) holder:");
		System.out.println(gs.getPersonByID(201904707));
		System.out.println();
		
		System.out.println("Searching for guitar's SSN (Specified Serial Number) b7TEH3pQ:");
		System.out.println(gs.getGuitarBySerialNum("b7TEH3pQ"));
		System.out.println();
		
		System.out.println("Searching for employees (Sara Bitar & Diana Haidar):");
		System.out.println(gs.hasEmployee("Sara Bitar"));
		System.out.println(gs.hasEmployee("Diana Haidar"));
		System.out.println();

		System.out.println("Searching for employee's index with ID# 199602894:");
		System.out.println("Index: " + gs.searchEmployeesByID(199602894));
		System.out.println();
		
		System.out.println("Searching for Hadi Chamli:");
		System.out.println("Index: " + gs.searchEmployeesByName("Hadi Chamli"));
		System.out.println();
		System.out.println("Searching for Alaa Al Sharif");
		System.out.println("Index: " + gs.searchEmployeesByName("Alaa Al Sharif"));
		System.out.println();
		
		gs.sortEmployeesByName();
		gs.sortGuitarsByPrices();
		
		gs.printAll();
	}

}
