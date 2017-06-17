package by.krukouski.triangle;

public class Perimeter {
	public static double definePerimeter(Triangle triangle) {
		return triangle.sideOne.defineLength() + triangle.sideTwo.defineLength() + triangle.sideThree.defineLength();  		
	}
}