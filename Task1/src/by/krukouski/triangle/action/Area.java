package by.krukouski.triangle.action;

import by.krukouski.triangle.figure.Triangle;

public class Area {
	public static double defineArea(Triangle triangle) {
		double semiPerimeter = Perimeter.definePerimeter(triangle) / 2;
		
		double diffSideOne = semiPerimeter - triangle.getSideOne().defineLength();
		double diffSideTwo = semiPerimeter - triangle.getSideTwo().defineLength();
		double diffSideThree = semiPerimeter - triangle.getSideThree().defineLength();
		
		return  Math.sqrt(semiPerimeter * diffSideOne * diffSideTwo * diffSideThree );  		
	}
}
