package by.krukouski.triangle;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest {
	private static Triangle triangle;
	
	@BeforeClass
	public static void initTriangle() {
		Point pointOne = new  Point(-1, 3);
		Point pointTwo = new Point(2, 3);
		Point pointThree = new Point(2, -1);
		
		Side sideOne = new  Side(pointOne, pointTwo);
		Side sideTwo = new Side(pointOne, pointThree);
		Side sideThree = new Side(pointTwo, pointThree);
		
	    triangle = new Triangle(sideOne, sideTwo, sideThree);
	}
	
	@Test
	public void definePerimeter() {
		double expected = 12;
		double actual = triangle.definePerimeter();
		
		Assert.assertEquals(expected, actual, 0.01);
	}

	@Test
	public void defineArea() {
		double expected = 6;
		double actual = triangle.defineArea();
		
		Assert.assertEquals(expected, actual, 0.01);
	}

}
