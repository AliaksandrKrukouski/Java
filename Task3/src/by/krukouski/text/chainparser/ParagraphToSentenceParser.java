package by.krukouski.text.chainparser;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphToSentenceParser implements TextParserInterface {
	private TextParserInterface nextParser;
	private static String regexp = "\\p{Alnum}+[\\p{Print}&&[^\\.?!]]+[\\.?!]+";
    private ArrayList<String> listSentences = new ArrayList<String>();
	
	@Override
	public void setNextParser(TextParserInterface nextParser) {
		this.nextParser = nextParser;
	}
	
	@Override
	public void parse(String text) {
		Pattern pattern = Pattern.compile(regexp);
		Matcher matcher = pattern.matcher(text);
		String sentence;
		
		while (matcher.find()) {
			sentence = matcher.group();
			System.out.println("   Sentence: " + sentence);
			listSentences.add(sentence);
			
			if (nextParser != null) {
				nextParser.parse(sentence);
			}
		}
	}

	public ArrayList<String> getParsedList() {
		return listSentences;
	}
}
