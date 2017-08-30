package by.krukouski.text.textcomposite;

public class TextSymbol implements TextComponentInterface {
	private String symbol;
	
	public TextSymbol(String symbol) {
		this.symbol = symbol;
	}

	@Override
	public void addComponent(TextComponentInterface component) {}

	@Override
	public String toString() {
		return symbol;
	}
}