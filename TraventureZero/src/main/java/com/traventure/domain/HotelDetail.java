package com.traventure.domain;


public class HotelDetail {

	 private String _id;
	 private String hotel_name;  
	 private String hotel_description;
	 
	 public HotelDetail(){}
	 
	
	 public HotelDetail(String hotel_name, String hotel_description) {
		this.hotel_name = hotel_name;
		this.hotel_description = hotel_description;
	}
	 
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getHotel_name() {
		return hotel_name;
	}
	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}
	public String getHotel_description() {
		return hotel_description;
	}
	public void setHotel_description(String hotel_description) {
		this.hotel_description = hotel_description;
	}
	@Override
	public String toString() {
		return "HotelDetails [_id=" + _id + ", hotel_name=" + hotel_name + ", hotel_description=" + hotel_description + "]";
	}

	
	
}
