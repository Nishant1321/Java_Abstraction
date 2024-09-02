package com.demos.vehicle;

public class Tata implements Car {
	private CarDetails cardetails;
	

	public CarDetails getCardetails() {
		return cardetails;
	}

	public void setCardetails(CarDetails cardetails) {
		this.cardetails = cardetails;
	}

	public String tata() {
		// TODO Auto-generated method stub
		return "good milage";
	}

	public String toyato() {
		// TODO Auto-generated method stub
		return "5 star sefty";
	}

	@Override
	public String milage() {
		// TODO Auto-generated method stub
		return cardetails.milage();
	}

	@Override
	public String seater() {
		// TODO Auto-generated method stub
		return cardetails.seater();
	}

}
