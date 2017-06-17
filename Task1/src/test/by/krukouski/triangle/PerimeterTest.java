package test.by.krukouski.triangle;

import org.junit.Assert;
import org.junit.Test;
import by.krukouski.triangle.*;
import by.krukouski.triangle.Perimeter;

public class PerimeterTest {
	private static Triangle triangle;
 
	@Test
	public void definePerimeter() {
		Point pointOne = new  Point(-1, 3);
		Point pointTwo = new Point(2, 3);
		Point pointThree = new Point(2, -1);
		
		Side sideOne = new  Side(pointOne, pointTwo);
		Side sideTwo = new Side(pointOne, pointThree);
		Side sideThree = new Side(pointTwo, pointThree);
		
	    triangle = new Triangle(sideOne, sideTwo, sideThree);
	    
		double expected = 12;
		double actual = Perimeter.definePerimeter(triangle);
		
		Assert.assertEquals(expected, actual, 0.01);
	}
}
