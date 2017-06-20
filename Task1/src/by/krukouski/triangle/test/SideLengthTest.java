package by.krukouski.triangle.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import by.krukouski.triangle.figure.Side;
import by.krukouski.triangle.fileoperation.StringParser;
import by.krukouski.triangle.fileoperation.StringReader;

@RunWith(Parameterized.class)
public class SideLengthTest {	
	private String testData; 
	
	public SideLengthTest(String testData) {
		this.testData = testData;
	}
	
	@Parameters
	public static ArrayList<String> generateTestData() throws IOException {  
		return StringReader.readFile(new File("resource/SideLengthTest.txt"));
	}
	
	@Test
	public void defineLengthTest() {
		String[] testDataParsed = StringParser.split(testData, "@");
		
		String[] testDataPoints = StringParser.split(testDataParsed[0], ";"); 
		
		Side side = StringParser.buildSide(testDataPoints[0], testDataPoints[1]);
		
		double expected = Double.parseDouble(testDataParsed[1]); 
		double actual = side.defineLength();
 
		Assert.assertEquals(expected, actual, 0.01); 
	}
}