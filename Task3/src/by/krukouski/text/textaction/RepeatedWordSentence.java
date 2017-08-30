package by.krukouski.text.textaction;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.krukouski.text.textcomposite.TextComponentInterface;
import by.krukouski.text.textcomposite.TextComposite;
import by.krukouski.text.textconstant.TextType; 
import by.krukouski.text.textparserchain.TextToParagraphParser;

public class RepeatedWordSentence {

  public static void showRepeatedWordSentences(String text) {
	  int numRepeatedWords = 0;
	  HashSet<String> repeatedWords = new HashSet<String>();
	  TextComposite textComposite = (TextComposite) new TextToParagraphParser().parse(text);
	  
	  for (TextComponentInterface paragraphComposite:textComposite.getComponentList()) {		 

		  for (TextComponentInterface sentenceComposite: ((TextComposite) paragraphComposite).getComponentList()) { 
			  repeatedWords = new HashSet<String>();			  

			  for (TextComponentInterface lexemeComposite: ((TextComposite) sentenceComposite).getComponentList()) {				  

				  if (((TextComposite) lexemeComposite).getCompositeType() == TextType.WORD) {  
					  numRepeatedWords = 0;
					  Pattern pattern = Pattern.compile("\\b" + lexemeComposite.toString() + "\\b");
					  Matcher matcher = pattern.matcher(sentenceComposite.toString());  
					  
					  while (matcher.find()) { 
						  numRepeatedWords++; 
					  }
					  
					  if (numRepeatedWords > 1) { 
						  repeatedWords.add(lexemeComposite.toString() + " (" + numRepeatedWords + ")");
					  }
				  }
			  }
			  
			  if (repeatedWords.size() > 0) {
				  System.out.println(sentenceComposite.toString() + repeatedWords);
			  }
		  }
	  }
  }
  
}
