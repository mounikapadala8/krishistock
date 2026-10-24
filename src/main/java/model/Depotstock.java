package model;

public class Depotstock {
	
	private String depot_id;
	private String sku;
	private String scheme_id;
	private double total;
	public Depotstock(String depot_id, String sku, String scheme_id, double total) {
		super();
		this.depot_id = depot_id;
		this.sku = sku;
		this.scheme_id = scheme_id;
		this.total = total;
	}
	public String getDepot_id() {
		return depot_id;
	}
	public void setDepot_id(String depot_id) {
		this.depot_id = depot_id;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getScheme_id() {
		return scheme_id;
	}
	public void setScheme_id(String scheme_id) {
		this.scheme_id = scheme_id;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
}
