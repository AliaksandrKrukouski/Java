package by.krukouski.triangle.figure;

import by.krukouski.triangle.exception.InvalidTriangleException;

public class Triangle {

	private Side sideOne;
	private Side sideTwo;
	private Side sideThree;    
	
	public Triangle(Side sideOne, Side sideTwo, Side sideThree) throws InvalidTriangleException  {
		if (validate(sideOne, sideTwo, sideThree)) {
			this.sideOne = sideOne;
			this.sideTwo = sideTwo;
			this.sideThree = sideThree;
		} else {
			throw new InvalidTriangleException("All points are on the same line.");
		}
	}
	
	public boolean validate(Side sideOne, Side sideTwo, Side sideThree) {
		boolean xEqual = (sideOne.getPointOne().getX() == sideOne.getPointTwo().getX()) 
			 			  && (sideTwo.getPointOne().getX() == sideTwo.getPointTwo().getX());
		boolean yEqual = (sideOne.getPointOne().getY() == sideOne.getPointTwo().getY()) 
			 			  && (sideTwo.getPointOne().getY() == sideTwo.getPointTwo().getY());
	  
	  return !(xEqual || yEqual);
    }
	

	public Side getSideOne() {
		return sideOne;
	}

	public void setSideOne(Side sideOne) {
		this.sideOne = sideOne;
	}

	public Side getSideTwo() {
		return sideTwo;
	}

	public void setSideTwo(Side sideTwo) {
		this.sideTwo = sideTwo;
	}

	public Side getSideThree() {
		return sideThree;
	}

	public void setSideThree(Side sideThree) {
		this.sideThree = sideThree;
	}
}