package by.krukouski.text.textparserchain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.krukouski.text.textcomposite.TextComponentInterface;
import by.krukouski.text.textcomposite.TextComposite;
import by.krukouski.text.textconstant.TextType;

public class ParagraphToSentenceParser implements TextParserInterface {
	private static Logger logger = LogManager.getLogger(ParagraphToSentenceParser.class.getName());
	private static String regexpSentence = "\\p{Alnum}+[\\p{Print}&&[^\\.?!]]+[\\.?!]+";
	private TextComposite sentenceComposite = new TextComposite(TextType.SENTENCE);
 
	@Override
	public TextComponentInterface parse(String paragraph) {
		Pattern pattern = Pattern.compile(regexpSentence);
		Matcher matcher = pattern.matcher(paragraph);
		String sentence;
		
		while (matcher.find()) {
			sentence = matcher.group();
			logger.info("Sentence: " + sentence);
			
			sentenceComposite.addComponent(new SentenceToLexemeParser().parse(sentence));
		}
		
		return sentenceComposite;
	}
}