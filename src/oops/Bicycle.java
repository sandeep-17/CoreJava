package oops;

public abstract class Bicycle implements InterfaceVehicle {
	
	protected String color;
	protected int noOfWheels;
	protected boolean gear;
	
	protected int accelaratedspeed = 20;
	protected String manufacturer;
	
	public Bicycle() {
		System.out.println("calling bicycle contructor");
	}
	
	public void goRide() {
		System.out.println("I can ride only in Land");
	}

	public void applyBrake() {
		System.out.println("I can apply front and back brake");
	}

	public abstract void accelerateSpeed();
	
	public void switchOnLights(){
		System.out.println("This is a single colored light..");
	}
	
	public int getAccelaratedspeed() {
		return accelaratedspeed;
	}
	public void setAccelaratedspeed(int accelaratedspeed) {
		this.accelaratedspeed = accelaratedspeed;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	public boolean isGear() {
		return gear;
	}
	public void setGear(boolean gear) {
		this.gear = gear;
	}

}
