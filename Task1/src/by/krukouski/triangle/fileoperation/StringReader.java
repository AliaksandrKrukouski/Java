package by.krukouski.triangle.fileoperation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StringReader {
	public static ArrayList<String> readFile(File file) throws IOException {
		BufferedReader reader = null; 
		ArrayList<String> fileRows  = new ArrayList<String>();
		String line;
		
		try {
			reader = new BufferedReader(new FileReader(file));
			
			while ((line = reader.readLine()) != null) {
				fileRows.add(line);
			} 
		} finally {		
			reader.close();
		}
		
		return fileRows;
	}
}