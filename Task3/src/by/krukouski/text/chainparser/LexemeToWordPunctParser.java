package by.krukouski.text.chainparser;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexemeToWordPunctParser implements TextParserInterface {
	private TextParserInterface nextParser;
	private static String regexpWord = "[^\\p{Punct}]+[\\p{Alnum}-']+[^\\p{Punct}]+";
	private static String regexpPunct = "\\p{Punct}+";
    private ArrayList<String> listWordPuncts = new ArrayList<String>();
    
	@Override
	public void setNextParser(TextParserInterface nextParser) {
		this.nextParser = nextParser;
	}

	@Override
	public void parse(String text) {
		Pattern patternWord = Pattern.compile(regexpWord);
		Matcher matcherWord = patternWord.matcher(text);
		String word = null;
		int wordStart, wordEnd; 
		
		Pattern patternPunct = Pattern.compile(regexpPunct );
		Matcher matcherPunct = patternPunct.matcher(text);
		String punct = null;
		int punctStart, punctEnd; 
		
		while(matcherWord.find() || matcherPunct.find()) {
			word = (matcherWord.group() == null)?word:matcherWord.group();
			wordStart = (matcherWord.group() == null)?0:matcherWord.start();
			wordEnd = (matcherWord.group() == null)?0:matcherWord.end();
			
			punct = (matcherPunct.group() == null)?punct:matcherPunct.group();
			punctStart = (matcherPunct.group() == null)?0:matcherPunct.start();
			punctEnd = (matcherPunct.group() == null)?0:matcherPunct.end();
			
			if (punctStart < wordStart) {
				System.out.println("         Punct: " + punct);
				listWordPuncts.add(punct);
				
				if (nextParser != null) {
					nextParser.parse(punct);
				}
			}
			
			if (wordStart > 0) {
				System.out.println("         Word: " + word);
				listWordPuncts.add(word);
				
				if (nextParser != null) {
					nextParser.parse(word);
				}
			}
			
			if (punctStart >= wordEnd) {
				System.out.println("         Punct: " + punct);
				listWordPuncts.add(punct);
				
				if (nextParser != null) {
					nextParser.parse(punct);
				}
			}			 
		}
	}
	
	public ArrayList<String> getParsedList() {
		return listWordPuncts;
	}
}
