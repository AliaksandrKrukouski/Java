package by.krukouski.triangle;

public class Triangle {
	Side sideOne;
	Side sideTwo;
	Side sideThree;    
	
	public Triangle(Side sideOne, Side sideTwo, Side sideThree) {
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
	}

	public double definePerimeter() {
		return sideOne.defineLength() + sideTwo.defineLength() + sideThree.defineLength();  		
	}
	
	public double defineArea() {
		double semiPerimeter = definePerimeter() / 2;
		
		double diffSideOne = semiPerimeter - sideOne.defineLength();
		double diffSideTwo = semiPerimeter - sideTwo.defineLength();
		double diffSideThree = semiPerimeter - sideThree.defineLength();
		
		return  Math.sqrt(semiPerimeter * diffSideOne * diffSideTwo * diffSideThree );  		
	}
}