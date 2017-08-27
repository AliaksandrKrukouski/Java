package by.krukouski.text.textparserchain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.krukouski.text.textcomposite.TextComponentInterface;
import by.krukouski.text.textcomposite.TextComposite;
import by.krukouski.text.textconstant.BeginEnd;
import by.krukouski.text.textconstant.TextType;

public class LexemeToPunctuationParser implements TextParserInterface {
	private TextComposite punctComposite = new TextComposite(TextType.PUNCTUATION);
//	private WordPunctToSymbolParser symbolParser = new WordPunctToSymbolParser();
	
	@Override
	public TextComponentInterface parse(String lexeme) {		
		return parse(lexeme, BeginEnd.END);
	}
	
	public TextComponentInterface parse(String lexeme, BeginEnd beginEnd) {
		String regexpPunct = (beginEnd == BeginEnd.BEGIN ? "^\\p{Punct}+" : "\\p{Punct}+$");
		
		Pattern patternPunct = Pattern.compile(regexpPunct);
		Matcher matcherPunct = patternPunct.matcher(lexeme);
		String punct; 
		
		while(matcherPunct.find()) {
			punct = matcherPunct.group();
			System.out.println("        Punct: " + punct);
			 
			punctComposite.addComponent(new WordPunctToSymbolParser().parse(punct)); 
		}
		
		return punctComposite;
	}
}
