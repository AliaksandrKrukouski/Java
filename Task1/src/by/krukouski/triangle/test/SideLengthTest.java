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

import by.krukouski.triangle.exception.FileNotExistsException;
import by.krukouski.triangle.exception.IncorrectInputParameterException;
import by.krukouski.triangle.figure.FigureBuilder;
import by.krukouski.triangle.figure.Side;
import by.krukouski.triangle.fileoperation.StringReader;

@RunWith(Parameterized.class)
public class SideLengthTest {	
	private String testData; 
	
	public SideLengthTest(String testData) {
		this.testData = testData;
	}
	
	@Parameters
	public static ArrayList<String> generateTestData() throws IOException, FileNotExistsException {  
		return StringReader.readFile(new File("resource/SideLengthTest.txt"));
	}
	
	@Test
	public void defineLengthTest() {
		Side side = null;
		
		String[] testDataParsed = testData.split("@");
		
		String[] testDataPoints = testDataParsed[0].split(";"); 
		
		try {
			side = FigureBuilder.buildSide(testDataPoints[0], testDataPoints[1], ",");
		} catch (IncorrectInputParameterException e) {
			fail(e.getMessage());
		}
		
		double expected = Double.parseDouble(testDataParsed[1]); 
		double actual = side.defineLength();
 
		Assert.assertEquals(expected, actual, 0.01); 
	}
}