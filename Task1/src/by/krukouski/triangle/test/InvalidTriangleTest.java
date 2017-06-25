package by.krukouski.triangle.test;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import by.krukouski.triangle.exception.FileNotExistsException;
import by.krukouski.triangle.exception.IncorrectInputParameterException;
import by.krukouski.triangle.exception.InvalidTriangleException;
import by.krukouski.triangle.figure.FigureBuilder;
import by.krukouski.triangle.fileoperation.StringReader;

@RunWith(Parameterized.class)
public class InvalidTriangleTest {
	private String testData; 
	
	public InvalidTriangleTest(String testData) {
		this.testData = testData;
	}
	
	@Parameters
	public static ArrayList<String> generateTestData() throws IOException, FileNotExistsException {  
		return StringReader.readFile(new File("resource/InvalidTriangleTest.txt"));
	}
	
	@Test(expected = InvalidTriangleException.class)
	public void Triangle() throws InvalidTriangleException {
		try {
			FigureBuilder.buildTriangle(testData, ";", ",");
		} catch (IncorrectInputParameterException e) {
			fail(e.getMessage());
		}
	}
}