package by.krukouski.text.textparserchain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.krukouski.text.textcomposite.TextComponentInterface;
import by.krukouski.text.textcomposite.TextComposite;
import by.krukouski.text.textconstant.TextType;

public class LexemeToWordParser implements TextParserInterface {
	private static String regexpWord = "[\\p{Alnum}-']+[^\\p{Punct}]*"; 
	private TextComposite wordComposite = new TextComposite(TextType.WORD);
//	private WordPunctToSymbolParser symbolParser = new WordPunctToSymbolParser();
	
	@Override
	public TextComponentInterface parse(String lexeme) {
		Pattern patternWord = Pattern.compile(regexpWord);
		Matcher matcherWord = patternWord.matcher(lexeme);
		String word;  
				
		while(matcherWord.find()) {
			word = matcherWord.group();
//			System.out.println("        Word: " + word);
			 
			wordComposite.addComponent(new WordPunctToSymbolParser().parse(word)); 
		}
		
		return wordComposite;
	}
}
