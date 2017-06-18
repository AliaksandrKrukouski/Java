package test.by.krukouski.triangle;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
 
import by.krukouski.triangle.Reader;
import by.krukouski.triangle.Triangle;
import by.krukouski.triangle.Area;
import by.krukouski.triangle.InvalidTriangleException;
import by.krukouski.triangle.Parser;

public class AreaTest {

	@Test
	public void defineArea() {
		File testFile = new File("resource/AreaTest.txt");
		String[] testData;
		
		Triangle triangle;
				
		double expected;
		double actual; 
		
	    try {
	    	testData = Parser.split(Reader.readFile(testFile).get(0), "@"); 
	    	
	    	triangle = Parser.buildTriangle(testData[0]);
	    	
	    	expected = Double.parseDouble(testData[1]);
	    	actual = Area.defineArea(triangle);
			
			Assert.assertEquals(expected, actual, 0.01);
	    } catch(InvalidTriangleException | IOException e) {
	    	fail(e.getMessage());
	    }
	}
}