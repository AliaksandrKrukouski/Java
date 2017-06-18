package by.krukouski.triangle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reader {
	private static BufferedReader reader;

	public static ArrayList<String> readFile(File file) throws IOException {
		ArrayList<String> fileRows  = new ArrayList<String>(); 
		reader = new BufferedReader(new FileReader(file));
		String line;
		
		while ((line = reader.readLine()) != null) {
			fileRows.add(line);
		}
		
		return fileRows;
	}
}
