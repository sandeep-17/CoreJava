package oops;

public class RemodelledBicycle extends Bicycle{

	private int ridingSpeedAtMountains;
	
	public RemodelledBicycle() {
		System.out.println("Calling Remodelled Bicycle constructor...");
	}

	//new definition
	void changeGear() {

	}
	
	@Override
	public void accelerateSpeed() {
		accelaratedspeed=accelaratedspeed+40;
		System.out.println("Speed of Remodelled Bicycle: "+accelaratedspeed);
		
	}
	@Override
	public void goRide() {
		System.out.println("I can ride in both land and mountains");
	}
	
	@Override
	public void switchOnLights() {
		System.out.println("This is a multi colored light..");
	}

	@Override
	public void testMethodWithArgs(String test1, int test2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void interfaceMethods() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void interfaceMethods2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void interfaceMethods3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void interfaceMethod4() {
		// TODO Auto-generated method stub
		
	}

}
