package by.krukouski.text;

import by.krukouski.text.chainparser.LexemeToWordPunctParser;
import by.krukouski.text.chainparser.ParagraphToSentenceParser;
import by.krukouski.text.chainparser.SentenceToLexemeParser;
import by.krukouski.text.chainparser.TextParserInterface;
import by.krukouski.text.chainparser.TextToParagraphParser;

public class Runner { 
	public static void main(String[] args) {
		String text = //"The BreakIterator class implements methods for finding the location of boundaries in text. Instances of BreakIterator maintain a current position and scan over text returning the index of characters where boundaries occur. Internally, BreakIterator scans text using a CharacterIterator, and is thus able to scan text held by any object implementing that protocol. A StringCharacterIterator is used to scan String objects passed to setText." + "\n" +
                //"You use the factory methods provided by this class to create instances of various types of break iterators. In particular, use getWordInstance, getLineInstance, getSentenceInstance, and getCharacterInstance to create BreakIterators that perform word, line, sentence, and character boundary analysis respectively. A single BreakIterator can work only on one unit (word, line, sentence, and so on). You must use a different iterator for each unit boundary analysis you wish to perform.";
				"aaa? lpo. hjh hhh-vvv.  nn'n:xxx..." + "\n" + "\n" + "bbb?! ccc." + "\n" + "ddd,eee! A -is not a B!";  
		
		TextParserInterface textToParagraph = new TextToParagraphParser();
		TextParserInterface paragraphToSentene = new ParagraphToSentenceParser();
		TextParserInterface sentenceToLexeme = new SentenceToLexemeParser();
		TextParserInterface lexemeToWordPunct = new LexemeToWordPunctParser();
		
		textToParagraph.setNextParser(paragraphToSentene);
		paragraphToSentene.setNextParser(sentenceToLexeme);
		sentenceToLexeme.setNextParser(lexemeToWordPunct);
		
		System.out.println(text);
		textToParagraph.parse(text);
		
	}

}
