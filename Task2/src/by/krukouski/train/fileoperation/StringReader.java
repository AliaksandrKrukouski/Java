package by.krukouski.train.fileoperation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import by.krukouski.train.exception.FileNotExistsException;

public class StringReader {

	public static ArrayList<String> readFileIntoList (String path) throws IOException, FileNotExistsException {
		File file = new File(path);
		BufferedReader reader = null;
		ArrayList<String> fileRows  = new ArrayList<String>();
		String line;
		
		if (!file.exists()) {
			throw new FileNotExistsException(file.getName() + " do not exists");
		}
		
		try {
			reader = new BufferedReader(new FileReader(file));
			
			while ((line = reader.readLine()) != null) {
				fileRows.add(line); 
			}
		} catch(IOException e) {
			throw e;
		} finally {
			reader.close();
		}
		
		return fileRows;
	}
}