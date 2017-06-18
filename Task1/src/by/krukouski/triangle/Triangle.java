package by.krukouski.triangle;

public class Triangle {
	Side sideOne;
	Side sideTwo;
	Side sideThree;    
	
	public Triangle(Side sideOne, Side sideTwo, Side sideThree) throws InvalidTriangleException  {
		
		boolean xEqual = (sideOne.getPointOne().getX() == sideOne.getPointTwo().getX()) 
						 && (sideTwo.getPointOne().getX() == sideTwo.getPointTwo().getX());
		boolean yEqual = (sideOne.getPointOne().getY() == sideOne.getPointTwo().getY()) 
						 && (sideTwo.getPointOne().getY() == sideTwo.getPointTwo().getY());
		
		if (xEqual || yEqual){
			throw new InvalidTriangleException("All points are on the same line."); 
		}
		
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
	}
}