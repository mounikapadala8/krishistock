package model;

public class Skus {
	
	private String skus;
	private String product;
	private String description;
	private double unit_kg;
	public Skus(String skus, String product, String description, double unit_kg) {
		super();
		this.skus = skus;
		this.product = product;
		this.description = description;
		this.unit_kg = unit_kg;
	}
	public String getSkus() {
		return skus;
	}
	public void setSkus(String skus) {
		this.skus = skus;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getUnit_kg() {
		return unit_kg;
	}
	public void setUnit_kg(double unit_kg) {
		this.unit_kg = unit_kg;
	}
	
	

}
