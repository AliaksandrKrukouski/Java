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
				case LEXEME:
					resultString = resultString + component.toString() + " ";
					break;			
				case PARAGRAPH:
					resultString = resultString + component.toString() + "\n";	
					break;
				default:
					resultString = resultString + component.toString();	
					break;
			}
		}
		
		return resultString;
	}
}