package model;

public class Depots {
	
	private String depot_id;
	private String district;
	private String name;
	
	public Depots(String depot_id, String district, String name) {
		super();
		this.depot_id = depot_id;
		this.district = district;
		this.name = name;
	}
	public String getDepot_id() {
		return depot_id;
	}
	public void setDepot_id(String depot_id) {
		this.depot_id = depot_id;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
