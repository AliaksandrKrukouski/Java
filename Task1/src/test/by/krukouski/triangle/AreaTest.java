package test.by.krukouski.triangle;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.fail;

import by.krukouski.triangle.Point;
import by.krukouski.triangle.Side;
import by.krukouski.triangle.Triangle;
import by.krukouski.triangle.Area;
import by.krukouski.triangle.InvalidTriangleException;

public class AreaTest {
	private static Triangle triangle;

	@Test
	public void defineArea() {
		Point pointOne = new  Point(-1, 3);
		Point pointTwo = new Point(2, 3);
		Point pointThree = new Point(2, -1);
		
		Side sideOne = new  Side(pointOne, pointTwo);
		Side sideTwo = new Side(pointOne, pointThree);
		Side sideThree = new Side(pointTwo, pointThree);
		
	    try {
	    	triangle = new Triangle(sideOne, sideTwo, sideThree);
	    } catch(InvalidTriangleException e) {
	    	fail(e.getMessage());
	    }
	    
		double expected = 6;
		double actual = Area.defineArea(triangle);
		
		Assert.assertEquals(expected, actual, 0.01);
	}
}

