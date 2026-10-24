package model;

public class Schemes {
	
	private int scheme_id;
	private String season;
	private String opens_at;
	private String closes_at;
	public Schemes(int scheme_id, String season, String opens_at, String closes_at) {
		super();
		this.scheme_id = scheme_id;
		this.season = season;
		this.opens_at = opens_at;
		this.closes_at = closes_at;
	}
	public int getScheme_id() {
		return scheme_id;
	}
	public void setScheme_id(int scheme_id) {
		this.scheme_id = scheme_id;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getOpens_at() {
		return opens_at;
	}
	public void setOpens_at(String opens_at) {
		this.opens_at = opens_at;
	}
	public String getCloses_at() {
		return closes_at;
	}
	public void setCloses_at(String closes_at) {
		this.closes_at = closes_at;
	}
	
	

}
