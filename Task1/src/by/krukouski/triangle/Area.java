package by.krukouski.triangle;

public class Area {
	public static double defineArea(Triangle triangle) {
		double semiPerimeter = Perimeter.definePerimeter(triangle) / 2;
		
		double diffSideOne = semiPerimeter - triangle.sideOne.defineLength();
		double diffSideTwo = semiPerimeter - triangle.sideTwo.defineLength();
		double diffSideThree = semiPerimeter - triangle.sideThree.defineLength();
		
		return  Math.sqrt(semiPerimeter * diffSideOne * diffSideTwo * diffSideThree );  		
	}
}
