package model;

public class Reservation {
	
	private String reservation_id;
	private String idempotency_key;
	private String farmer_id;
	private String depot_id;
	private String sku;
	private String scheme_id;
	private double qty;
	private String status; 
	private String created_at; 
	private String expires_at; 
	private String confirmed_at;
	public Reservation(String reservation_id, String idempotency_key, String farmer_id, String depot_id, String sku,
			String scheme_id, double qty, String status, String created_at, String expires_at, String confirmed_at) {
		super();
		this.reservation_id = reservation_id;
		this.idempotency_key = idempotency_key;
		this.farmer_id = farmer_id;
		this.depot_id = depot_id;
		this.sku = sku;
		this.scheme_id = scheme_id;
		this.qty = qty;
		this.status = status;
		this.created_at = created_at;
		this.expires_at = expires_at;
		this.confirmed_at = confirmed_at;
	}
	public String getReservation_id() {
		return reservation_id;
	}
	public void setReservation_id(String reservation_id) {
		this.reservation_id = reservation_id;
	}
	public String getIdempotency_key() {
		return idempotency_key;
	}
	public void setIdempotency_key(String idempotency_key) {
		this.idempotency_key = idempotency_key;
	}
	public String getFarmer_id() {
		return farmer_id;
	}
	public void setFarmer_id(String farmer_id) {
		this.farmer_id = farmer_id;
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
	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getExpires_at() {
		return expires_at;
	}
	public void setExpires_at(String expires_at) {
		this.expires_at = expires_at;
	}
	public String getConfirmed_at() {
		return confirmed_at;
	}
	public void setConfirmed_at(String confirmed_at) {
		this.confirmed_at = confirmed_at;
	}
	
	
	
	
	
	
	

}
