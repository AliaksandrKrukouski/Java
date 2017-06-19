package by.krukouski.triangle.test;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import by.krukouski.triangle.exception.InvalidTriangleException;
import by.krukouski.triangle.fileoperation.StringParser;
import by.krukouski.triangle.fileoperation.StringReader;

public class InvalidTriangleTest {
	@Test(expected = InvalidTriangleException.class )
	public void Triangle() throws InvalidTriangleException {
		File testFile = new File("resource/InvalidTriangleTest.txt"); 
		
		try {  
			StringParser.buildTriangle(StringReader.readFile(testFile).get(0));
		}  catch(IOException e) {
	    	fail(e.getMessage());
	    }
	}
}