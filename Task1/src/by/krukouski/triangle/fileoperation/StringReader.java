package by.krukouski.triangle.fileoperation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.krukouski.triangle.exception.FileNotExistsException;
import by.krukouski.triangle.figure.SingleTriangle;

public class StringReader {
	private static Logger logger = LogManager.getLogger(SingleTriangle.class.getName());
	
	public static ArrayList<String> readFile(File file) throws IOException, FileNotExistsException {
		BufferedReader reader = null; 
		ArrayList<String> fileRows  = new ArrayList<String>();
		String line;
		
		if (!file.exists()) {
			logger.error(file.getName() + " do not exists");
			throw new FileNotExistsException(file.getName() + " do not exists");
		}
		
		try {
			reader = new BufferedReader(new FileReader(file));
			
			while ((line = reader.readLine()) != null) {
				fileRows.add(line);
				logger.info("Read line " + line );
			} 
		} catch(IOException e) {
			logger.error("Can not read the file " + file.getName());
			throw e;
		} finally {		
			reader.close();
		}
		
		return fileRows;
	}
}