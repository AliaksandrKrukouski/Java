package by.krukouski.text.textparserchain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.krukouski.text.textcomposite.TextComponentInterface;
import by.krukouski.text.textcomposite.TextComposite;
import by.krukouski.text.textcomposite.TextSymbol;
import by.krukouski.text.textconstant.TextType;

public class WordPunctToSymbolParser implements TextParserInterface {
	private static String regexpSymbol = ".";
	private TextComponentInterface symbolComposite = new TextComposite(TextType.SYMBOL);

	@Override
	public TextComponentInterface parse(String wordPunct) { 
		Pattern patternSymbol = Pattern.compile(regexpSymbol);
		Matcher matcherSymbol = patternSymbol.matcher(wordPunct);
		String symbol;
		
		while(matcherSymbol.find()) {
			symbol = matcherSymbol.group();
			System.out.println("          Symbol: " + symbol);
			symbolComposite.addComponent(new TextSymbol(symbol));
		}
		
		return symbolComposite;
	}
}