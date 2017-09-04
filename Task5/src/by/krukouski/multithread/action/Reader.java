package by.krukouski.multithread.action;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException; 

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.krukouski.multithread.exception.EmptyFileException;
import by.krukouski.multithread.exception.IncorrectParamsException;
 
public class Reader {
	private static Logger logger = LogManager.getLogger(Reader.class.getName());
	
	public static String[] readParams(String path) throws EmptyFileException, IncorrectParamsException, IOException {
		File file = new File(path);
		BufferedReader reader = null; 
		String line;
		String[] parsedLine;
		 
		try {
			reader = new BufferedReader(new FileReader(file));
			line = reader.readLine();
			
			if (line == null) {
				throw new EmptyFileException();
			} 
			parsedLine =  line.split("@");
			
			if (parsedLine.length != 2) {
				throw new IncorrectParamsException();
			}
			
		} catch (EmptyFileException e) {
			logger.error("File is empty " + file.getName());
			throw e;
		} catch (IncorrectParamsException e) {
			logger.error("File should contain \"PORT_CAPACITY\"@\"SHIP_NUMBER\" " + file.getName());
			throw e;
		} catch (IOException e) {
			logger.error("Can not read the file " + file.getName());
			throw e;
		} finally {
			reader.close();
		}
		
		return parsedLine;
	}
}
