package by.krukouski.text.chainparser;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextToParagraphParser implements TextParserInterface {
	private TextParserInterface nextParser;
	private static String regexp = ".+\n*?";
    private ArrayList<String> listParagraphs = new ArrayList<String>(); 
   
	@Override
	public void setNextParser(TextParserInterface nextParser) {
		this.nextParser = nextParser;
	}

	@Override
	public void parse(String text) {
		Pattern pattern = Pattern.compile(regexp);
		Matcher matcher = pattern.matcher(text);
		String paragraph;
		
		while (matcher.find()) {
			paragraph = matcher.group();
			System.out.println("Paragraph: " +  paragraph);
			listParagraphs.add(paragraph);
			
			if (nextParser != null) {
				nextParser.parse(paragraph);
			}
		}
	}
	
	public ArrayList<String> getParsedList() {
		return listParagraphs;
	}
}