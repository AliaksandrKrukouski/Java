package by.krukouski.text.textcomposite;

import java.util.ArrayList;

import by.krukouski.text.textconstant.TextType;

public class TextComposite implements TextComponentInterface {
	private ArrayList<TextComponentInterface> componentList = new ArrayList<TextComponentInterface>();
	private TextType compositeType;
	
	public TextComposite(TextType compositType) {
		this.compositeType = compositType;
	}
	
	@Override
	public void addComponent(TextComponentInterface component) {
		componentList.add(component);
	}
	
	public ArrayList<TextComponentInterface> getComponentList() {
		return componentList;
	}
    
	public TextType getCompositeType() {
		return compositeType;
	}
	
	@Override
	public String toString() {
		String resultString = new String();
		
		for(TextComponentInterface component:componentList) {
			switch (compositeType) { 
				case LEXEME: 
					resultString = resultString + component.toString() + (component.toString().length() > 0 ? " " : "");
					break;			 
				case PARAGRAPH:
					resultString = resultString + component.toString() + "\n";	
					break;
				default:
					resultString = resultString + component.toString();	
					break;
			}
		}
		
		return resultString.replaceAll(" (\\p{Punct}+)", "$1");
	}
}