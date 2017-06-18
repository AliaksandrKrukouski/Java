package test.by.krukouski.triangle;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import by.krukouski.triangle.*;

public class PerimeterTest {
 
	@Test
	public void definePerimeterTest() {
		File testFile = new File("resource/PerimeterTest.txt");
		String[] testData;
		
		Triangle triangle; 
		
		double expected;
		double actual; 
		
		try {
			testData = Parser.split(Reader.readFile(testFile).get(0), "@"); 
	    	
	    	triangle = Parser.buildTriangle(testData[0]);
	    	
	    	expected = Double.parseDouble(testData[1]);
	    	actual = Perimeter.definePerimeter(triangle);
	    	
	    	Assert.assertEquals(expected, actual, 0.01);
	    } catch(InvalidTriangleException | IOException e) {
	    	fail(e.getMessage());
	    }
	}
}
