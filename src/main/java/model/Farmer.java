package model;

public class Farmer {
	private String farmer_id;
	private String district;
	private int landholding_acres;
	private String depot_id;
	private String season;
	private String product;
	
	public Farmer(String farmer_id, String district, int landholding_acres, String depot_id, String season, String product) {
		super();
		this.farmer_id = farmer_id;
		this.district = district;
		this.landholding_acres = landholding_acres;
		this.depot_id = depot_id;
		this.season = season;
		this.product = product;
	}

	public String getFarmer_id() {
		return farmer_id;
	}

	public void setFarmer_id(String farmer_id) {
		this.farmer_id = farmer_id;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getLandholding_acres() {
		return landholding_acres;
	}

	public void setLandholding_acres(int landholding_acres) {
		this.landholding_acres = landholding_acres;
	}

	public String getDepot_id() {
		return depot_id;
	}

	public void setDepot_id(String depot_id) {
		this.depot_id = depot_id;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}
	
}
