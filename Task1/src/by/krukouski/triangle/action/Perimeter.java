package by.krukouski.triangle.action;

import by.krukouski.triangle.figure.Triangle;

public class Perimeter {
	public static double definePerimeter(Triangle triangle) {
		return triangle.getSideOne().defineLength() + triangle.getSideTwo().defineLength() + triangle.getSideThree().defineLength();  		
	}
}