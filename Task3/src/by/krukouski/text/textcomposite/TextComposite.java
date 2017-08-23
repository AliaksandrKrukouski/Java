package by.krukouski.text.textcomposite;

import java.util.ArrayList;

import by.krukouski.text.textconstant.TextType;

public class TextComposite implements TextComponentInterface {
	ArrayList<TextComponentInterface> componentList = new ArrayList<TextComponentInterface>();
	TextType compositeType;
	
	public TextComposite(TextType compositType) {
		this.compositeType = compositType;
	}
	
	@Override
	public void addComponent(TextComponentInterface component) {
		componentList.add(component);
	}

	@Override
	public String toString() {
		String resultString = new String();
		for(TextComponentInterface component:componentList) {
			switch (compositeType) {
				case SYMBOL:
					System.out.println("Gather text (SYMBOL):" + component);
					resultString = resultString + component.toString();
					break;
				case PUNCTUATION:
					resultString = resultString + component.toString();
					break;				
			    case WORD:
			    	System.out.println("Gather text (WORD):" + component);
			    	resultString = resultString + component.toString();
			    	break;
				case LEXEME:
					System.out.println("Gather text (LEXEME):" + component);
					resultString = resultString + component.toString();
					break;
				case SENTENCE:
					System.out.println("Gather text (SENTENCE):" + component);
					resultString = resultString + component.toString() + " ";	
					break;
				case PARAGRAPH:
					System.out.println("Gather text (PARAGRAPH):" + component);
					resultString = resultString + component.toString() + " ";	
					break;
				default:
					System.out.println("Gather text (DEFAULT):" + component);
					//resultString = component.toString();	
					break;
			}
		}
		
		return resultString;
	}
}