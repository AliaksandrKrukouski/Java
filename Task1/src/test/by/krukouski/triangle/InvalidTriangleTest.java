package test.by.krukouski.triangle;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;

import org.junit.Test; 
import by.krukouski.triangle.InvalidTriangleException;
import by.krukouski.triangle.Parser; 
import by.krukouski.triangle.Reader;

public class InvalidTriangleTest {
	@Test(expected = InvalidTriangleException.class )
	public void Triangle() throws InvalidTriangleException {
		File testFile = new File("resource/InvalidTriangleTest.txt"); 
		
		try {  
			Parser.buildTriangle(Reader.readFile(testFile).get(0));
		}  catch(IOException e) {
	    	fail(e.getMessage());
	    }
	}
}