
public abstract class ShopRecords implements TVA {

	private String shopName;
	private double revenue;
	
	public ShopRecords() {
		
	}
	
	public ShopRecords(String shopName, double revenue) {
		this.shopName = shopName;
		this.revenue = revenue;
	}
	
	public String getName() {
		return shopName;
	}

	public void setName(String name) {
		this.shopName = name;
	}

	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

}
