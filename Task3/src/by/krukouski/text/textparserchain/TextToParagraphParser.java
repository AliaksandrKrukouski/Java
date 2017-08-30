package by.krukouski.text.textparserchain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
import by.krukouski.text.textcomposite.TextComponentInterface;
import by.krukouski.text.textcomposite.TextComposite;
import by.krukouski.text.textconstant.TextType;

public class TextToParagraphParser implements TextParserInterface {
	private static Logger logger = LogManager.getLogger(TextToParagraphParser.class.getName());
	private static String regexpParagraph = ".+\n*?"; 
	private TextComposite paragraphComposite = new TextComposite(TextType.PARAGRAPH);
	
	@Override
	public TextComponentInterface parse(String text) { 
		Pattern pattern = Pattern.compile(regexpParagraph);
		Matcher matcher = pattern.matcher(text);
		String paragraph;
		
		while (matcher.find()) {
			paragraph = matcher.group();			
			logger.info("Paragraph: " +  paragraph);
			
			paragraphComposite.addComponent(new ParagraphToSentenceParser().parse(paragraph));
		}
		
		return paragraphComposite;
	} 
}