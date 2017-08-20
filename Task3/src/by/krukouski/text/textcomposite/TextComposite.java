package by.krukouski.text.textcomposite;

import java.util.ArrayList;

import by.krukouski.text.textconstant.TextType;

public class TextComposite implements TextComponentInterface {
	ArrayList<TextComponentInterface> componentList = new ArrayList<TextComponentInterface>();
	TextType compositType;
	
	public TextComposite(TextType compositType) {
		this.compositType = compositType;
	}

	@Override
	public void addComponent(TextComponentInterface component) {
		componentList.add(component); 
	}
}