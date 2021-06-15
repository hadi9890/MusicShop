public class Guitars extends ShopRecords{

	private String type;
	private String brand;
	private String color;
	private int price;
	private String serialNumber;
	private boolean available;

	public Guitars(String type, String brand, String color, int price,String serialNumber, boolean available) {
		super();
		this.type = type;
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.serialNumber = serialNumber;
		this.available = available;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return true;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public String toString() {
		return "Type: " + type + "\t\tBrand: " + brand + "\t\tColor: " + color + "\t\tPrice: " + price + "$\t\tSerial Number: " + serialNumber + "\t\tAvailable: " + available;
	}

	
	public double calculateSalary() {
		return 0;
	}

}
