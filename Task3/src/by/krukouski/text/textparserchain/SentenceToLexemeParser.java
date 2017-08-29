package by.krukouski.text.textparserchain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.krukouski.text.textcomposite.TextComponentInterface;
import by.krukouski.text.textcomposite.TextComposite;
import by.krukouski.text.textconstant.BeginEnd;
import by.krukouski.text.textconstant.TextType;

public class SentenceToLexemeParser implements TextParserInterface {
	private static String regexpLexeme = "\\p{Graph}+";
	private TextComposite lexemeComposite = new TextComposite(TextType.LEXEME);
//	private LexemeToWordParser wordParser = new LexemeToWordParser();
//	private LexemeToPunctuationParser punctuationParser = new LexemeToPunctuationParser();

	@Override
	public TextComponentInterface parse(String sentence) {
		Pattern pattern = Pattern.compile(regexpLexeme);
		Matcher matcher = pattern.matcher(sentence);
		String lexeme;
		
		while(matcher.find()) {
			lexeme = matcher.group();
//			System.out.println("      Lexeme: " + lexeme);
			
			lexemeComposite.addComponent(new LexemeToPunctuationParser().parse(lexeme, BeginEnd.BEGIN));
			lexemeComposite.addComponent(new LexemeToWordParser().parse(lexeme));
			lexemeComposite.addComponent(new LexemeToPunctuationParser().parse(lexeme, BeginEnd.END));
		}
		
		return lexemeComposite;
	}
}
