package by.krukouski.triangle.test;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import by.krukouski.triangle.action.Perimeter;
import by.krukouski.triangle.exception.InvalidTriangleException;
import by.krukouski.triangle.figure.Triangle;
import by.krukouski.triangle.fileoperation.StringParser;
import by.krukouski.triangle.fileoperation.StringReader;

public class PerimeterTest {
 
	@Test
	public void definePerimeterTest() {
		File testFile = new File("resource/PerimeterTest.txt");
		String[] testData;
		
		Triangle triangle; 
		
		double expected;
		double actual; 
		
		try {
			testData = StringParser.split(StringReader.readFile(testFile).get(0), "@"); 
	    	
	    	triangle = StringParser.buildTriangle(testData[0]);
	    	
	    	expected = Double.parseDouble(testData[1]);
	    	actual = Perimeter.definePerimeter(triangle);
	    	
	    	Assert.assertEquals(expected, actual, 0.01);
	    } catch(InvalidTriangleException | IOException e) {
	    	fail(e.getMessage());
	    }
	}
}
