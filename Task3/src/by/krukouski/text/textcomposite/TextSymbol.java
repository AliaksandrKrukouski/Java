package by.krukouski.text.textcomposite;

public class TextSymbol implements TextComponentInterface {
	String symbol;
	
	public TextSymbol(String symbol) {
		this.symbol = symbol;
	}

	@Override
	public void addComponent(TextComponentInterface component) {}

}
