package by.krukouski.text.textparserchain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.krukouski.text.textcomposite.TextComponentInterface;
import by.krukouski.text.textcomposite.TextComposite;
import by.krukouski.text.textconstant.TextType;

public class TextToParagraphParser implements TextParserInterface { 
	private static String regexpParagraph = ".+\n*?"; 
	private TextComposite paragraphComposite = new TextComposite(TextType.PARAGRAPH);
//	private ParagraphToSentenceParser paragraphParser = new ParagraphToSentenceParser();
	
	@Override
	public TextComponentInterface parse(String text) { 
		Pattern pattern = Pattern.compile(regexpParagraph);
		Matcher matcher = pattern.matcher(text);
		String paragraph;
		
		while (matcher.find()) {
			paragraph = matcher.group();
			System.out.println("Paragraph: " +  paragraph);
			paragraphComposite.addComponent(new ParagraphToSentenceParser().parse(paragraph)); 
		}
		
		return paragraphComposite;
	} 
}