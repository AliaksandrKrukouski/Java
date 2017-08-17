package by.krukouski.text.chainparser;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceToLexemeParser implements TextParserInterface {
	private TextParserInterface nextParser;
	private static String regexp = "\\p{Graph}+";
    private ArrayList<String> listLexemes = new ArrayList<String>();
  
	@Override
	public void setNextParser(TextParserInterface nextParser) {
		this.nextParser = nextParser;
	}

	@Override
	public void parse(String text) {
		Pattern pattern = Pattern.compile(regexp);
		Matcher matcher = pattern.matcher(text);
		String lexeme;
		
		while(matcher.find()) {
			lexeme = matcher.group();
			System.out.println("      Lexeme: " + lexeme);
			listLexemes.add(lexeme);
			
			if (nextParser != null) {
				nextParser.parse(lexeme);
			}
		}
	}

	@Override
	public ArrayList<String> getParsedList() { 
		return listLexemes;
	}

}
