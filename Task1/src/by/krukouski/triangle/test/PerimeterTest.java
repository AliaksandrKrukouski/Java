package by.krukouski.triangle.test;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import by.krukouski.triangle.action.Perimeter;
import by.krukouski.triangle.exception.FileNotExistsException;
import by.krukouski.triangle.exception.IncorrectInputParameterException;
import by.krukouski.triangle.exception.InvalidTriangleException;
import by.krukouski.triangle.exception.TriangleIsBusyException;
import by.krukouski.triangle.figure.FigureBuilder;
import by.krukouski.triangle.figure.SingleTriangle; 
import by.krukouski.triangle.fileoperation.StringReader;

@RunWith(Parameterized.class)
public class PerimeterTest {
	private String testData; 
	
	public PerimeterTest(String testData) {
		this.testData = testData;
	}
	
	@Parameters
	public static ArrayList<String> generateTestData() throws IOException, FileNotExistsException {  
		return StringReader.readFile(new File("resource/PerimeterTest.txt"));
	}
	
	@Test
	public void definePerimeterTest() {
		String[] testDataParsed;
		
		SingleTriangle triangle = null;
		
		double expected;
		double actual; 
		
		try {
			testDataParsed = testData.split("@"); 
	    	
			triangle = FigureBuilder.buildTriangle(testDataParsed[0], ";", ",");
	    	
	    	expected = Double.parseDouble(testDataParsed[1]);
	    	actual = Perimeter.definePerimeter(triangle);
	    	
	    	Assert.assertEquals(expected, actual, 0.01);
	    } catch(InvalidTriangleException | IncorrectInputParameterException | TriangleIsBusyException e) {
	    	fail(e.getMessage());
	    } finally {
	    	triangle.releaseTriangle();
	    }
	}
}
