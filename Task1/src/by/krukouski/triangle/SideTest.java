package by.krukouski.triangle;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class SideTest {
	
	@Test
	public void defineLength() {
		Point pointOne = new  Point(-1, 3);
		Point pointTwo = new Point(2, -1);
		
		Side side = new Side(pointOne, pointTwo); 
		
		double expected = 5;
		double actual = side.defineLength();
		
		Assert.assertEquals(expected, actual, 0.01); 
	}

}