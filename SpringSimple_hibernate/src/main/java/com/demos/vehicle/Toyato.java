package com.demos.vehicle;

public class Toyato implements Car {
private CarDetails cardetails;


	public CarDetails getCardetails() {
	return cardetails;
}

public void setCardetails(CarDetails cardetails) {
	this.cardetails = cardetails;
}

	@Override
	public String tata() {
		// TODO Auto-generated method stub
		return "sport car";
	}

	@Override
	public String toyato() {
		// TODO Auto-generated method stub
		return "9000 cc engine";
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
