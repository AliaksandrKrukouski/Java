package test.by.krukouski.triangle;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;
import by.krukouski.triangle.*;

public class PerimeterTest {
	private static Triangle triangle;
 
	@Test
	public void definePerimeterTest() {
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
	    
		double expected = 12;
		double actual = Perimeter.definePerimeter(triangle);
		
		Assert.assertEquals(expected, actual, 0.01);
	}
}
