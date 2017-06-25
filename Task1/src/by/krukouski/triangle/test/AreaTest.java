package by.krukouski.triangle.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList; 

import by.krukouski.triangle.action.Area;
import by.krukouski.triangle.exception.FileNotExistsException;
import by.krukouski.triangle.exception.IncorrectInputParameterException;
import by.krukouski.triangle.exception.InvalidTriangleException;
import by.krukouski.triangle.figure.FigureBuilder;
import by.krukouski.triangle.figure.Triangle;
import by.krukouski.triangle.fileoperation.StringReader;

@RunWith(Parameterized.class)
public class AreaTest {
	private String testData; 
	
	public AreaTest(String testData) {
		this.testData = testData;
	}

	@Parameters
	public static ArrayList<String> generateTestData() throws IOException, FileNotExistsException {  
		return StringReader.readFile(new File("resource/AreaTest.txt"));
	}
	
	@Test
	public void defineArea() { 
		String[] testDataParsed;
		
		Triangle triangle;
				
		double expected;
		double actual; 
		
	    try {
	    	testDataParsed = testData.split("@"); 
	    	
	    	triangle = FigureBuilder.buildTriangle(testDataParsed[0], ";", ",");
	    	
	    	expected = Double.parseDouble(testDataParsed[1]);
	    	actual = Area.defineArea(triangle);
			
			Assert.assertEquals(expected, actual, 0.01);
	    } catch(InvalidTriangleException | IncorrectInputParameterException e) {
	    	fail(e.getMessage());
	    }
	}
}