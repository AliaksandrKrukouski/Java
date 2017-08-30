package by.krukouski.text.textparserchain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.krukouski.text.textcomposite.TextComponentInterface;
import by.krukouski.text.textcomposite.TextComposite;
import by.krukouski.text.textconstant.TextType;

public class LexemeToWordParser implements TextParserInterface {
	private static Logger logger = LogManager.getLogger(TextComponentInterface.class.getName());
	private static String regexpWord = "[\\p{Alnum}-']+[^\\p{Punct}]*"; 
	private TextComposite wordComposite = new TextComposite(TextType.WORD);
	
	@Override
	public TextComponentInterface parse(String lexeme) { 
		Pattern patternWord = Pattern.compile(regexpWord);
		Matcher matcherWord = patternWord.matcher(lexeme);
		String word;  
				
		while(matcherWord.find()) {
			word = matcherWord.group();
			logger.info("Word: " + word);
			 
			wordComposite.addComponent(new WordPunctToSymbolParser().parse(word)); 
		}
		
		return wordComposite;
	}
}