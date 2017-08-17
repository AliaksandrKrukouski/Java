package by.krukouski.text.chainparser;

import java.util.ArrayList;

public interface TextParserInterface {
	public void setNextParser(TextParserInterface nextParser);
	
	public void parse(String text);
	
	public ArrayList<String> getParsedList();
}