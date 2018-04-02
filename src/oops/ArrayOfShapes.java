package oops;

public class ArrayOfShapes {

	//area of square
	void findArea(float side) {
		System.out.println("area of square:"+side*side);
	}
	//area of triangle
	void findArea(float constant, float length, float height) {
		System.out.println("area of triangle:"+constant*length*height);
	}
	//area of circle
	void findArea(float PI, float radius) {
		System.out.println("area of circle:"+PI*radius);
	}
	//area of rectangle
	void findArea(int length, float height) {
		System.out.println("area of rectangle:"+length*height);
	}
	
}
