package test.by.krukouski.triangle;

import org.junit.Test; 
import by.krukouski.triangle.InvalidTriangleException;
import by.krukouski.triangle.Point;
import by.krukouski.triangle.Side;
import by.krukouski.triangle.Triangle;

public class TriangleTest {
	@Test(expected = InvalidTriangleException.class )
	public void Triangle() throws InvalidTriangleException {
		Point pointOne = new  Point(1, 3);
		Point pointTwo = new Point(1, 0);
		Point pointThree = new Point(1, -1);
		
		Side sideOne = new  Side(pointOne, pointTwo);
		Side sideTwo = new Side(pointOne, pointThree);
		Side sideThree = new Side(pointTwo, pointThree);
		
		new Triangle(sideOne, sideTwo, sideThree);
	}
}