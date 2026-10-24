package model;

public class Product {
	
	private String product;
	private double kg_per_acre;
	public Product(String product, double kg_per_acre) {
		super();
		this.product = product;
		this.kg_per_acre = kg_per_acre;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public double getKg_per_acre() {
		return kg_per_acre;
	}
	public void setKg_per_acre(double kg_per_acre) {
		this.kg_per_acre = kg_per_acre;
	}
	
	

}
