package by.krukouski.triangle.figure;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.krukouski.triangle.exception.InvalidTriangleException;
import by.krukouski.triangle.exception.TriangleIsBusyException;

public class SingleTriangle {
	private static Logger logger = LogManager.getLogger(SingleTriangle.class.getName());
	
	private static SingleTriangle triangle;  
	private static boolean triangleIsAvailable = true;
	
	private Side sideOne;
	private Side sideTwo;
	private Side sideThree;    
	
	private SingleTriangle() {}
	
	public static SingleTriangle getTriangle() throws TriangleIsBusyException {
		if (triangleIsAvailable) {
			if (triangle == null) {
				triangle = new SingleTriangle();
			}
			
			triangleIsAvailable = false; 
			logger.info("Triangle is got");
		} else {
			logger.error("Triangle is busy");
			throw new TriangleIsBusyException("Triangle is busy");
		}	
		
		return triangle;
	}
	
	public void releaseTriangle() {
		if (!(triangle == null)) {
			triangle = null;
			
			this.setSideOne(null);
			this.setSideTwo(null);
			this.setSideThree(null);
			
			triangleIsAvailable = true;
			
			logger.info("Triangle is released");
		} else {
			logger.info("Triangle is already released");
		}
	}
	
	public void initTriangle(Side sideOne, Side sideTwo, Side sideThree) throws InvalidTriangleException {
		
		if (validate(sideOne, sideTwo)) {
			this.sideOne = sideOne;
			this.sideTwo = sideTwo;
			this.sideThree = sideThree;
			logger.info("Triangle is initialized: " + toString());
		} else {
			logger.error("Triangle is not initialized - all points are on the same line: " + toString(sideOne, sideTwo, sideThree));
			throw new InvalidTriangleException("Triangle did not created. All points are on the same line: "+ toString(sideOne, sideTwo, sideThree)); 
		}
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
	
	public boolean validate(Side sideOne, Side sideTwo) {
		boolean xEqual = (sideOne.getPointOne().getX() == sideOne.getPointTwo().getX()) 
			 			  && (sideTwo.getPointOne().getX() == sideTwo.getPointTwo().getX());
		boolean yEqual = (sideOne.getPointOne().getY() == sideOne.getPointTwo().getY()) 
			 			  && (sideTwo.getPointOne().getY() == sideTwo.getPointTwo().getY());
	  
	  return !(xEqual || yEqual);
    }

	@Override
	public String toString() {
		return "(" + sideOne.getPointOne().getX() + "," + sideOne.getPointOne().getY() + "), " +
			   "(" + sideTwo.getPointOne().getX() + "," + sideTwo.getPointOne().getY() + "), " +
			   "(" + sideThree.getPointOne().getX() + "," + sideThree.getPointOne().getY() + ")";
	}
	
	public String toString(Side sideOne, Side sideTwo, Side sideThree) {
		return "(" + sideOne.getPointOne().getX() + "," + sideOne.getPointOne().getY() + "), " +
			   "(" + sideTwo.getPointOne().getX() + "," + sideTwo.getPointOne().getY() + "), " +
			   "(" + sideThree.getPointOne().getX() + "," + sideThree.getPointOne().getY() + ")";
	}
	
}