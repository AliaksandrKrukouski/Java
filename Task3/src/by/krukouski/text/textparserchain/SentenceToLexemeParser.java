package by.krukouski.text.textparserchain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.krukouski.text.textcomposite.TextComponentInterface;
import by.krukouski.text.textcomposite.TextComposite;
import by.krukouski.text.textconstant.BeginEnd;
import by.krukouski.text.textconstant.TextType;

public class SentenceToLexemeParser implements TextParserInterface {
	private static Logger logger = LogManager.getLogger(SentenceToLexemeParser.class.getName());
	private static String regexpLexeme = "\\p{Graph}+";
	private TextComposite lexemeComposite = new TextComposite(TextType.LEXEME);

	@Override
	public TextComponentInterface parse(String sentence) {
		Pattern pattern = Pattern.compile(regexpLexeme);
		Matcher matcher = pattern.matcher(sentence);
		String lexeme;
		
		while(matcher.find()) {
			lexeme = matcher.group();
			logger.info("Lexeme: " + lexeme);
			
			lexemeComposite.addComponent(new LexemeToPunctuationParser().parse(lexeme, BeginEnd.BEGIN));
			lexemeComposite.addComponent(new LexemeToWordParser().parse(lexeme));
			lexemeComposite.addComponent(new LexemeToPunctuationParser().parse(lexeme, BeginEnd.END));
		}
		
		return lexemeComposite;
	}
}