package by.krukouski.triangle.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.krukouski.triangle.figure.SingleTriangle;

public class Area {
	private static Logger logger = LogManager.getLogger(Area.class.getName());
	
	public static double defineArea(SingleTriangle triangle) {
		double semiPerimeter = Perimeter.definePerimeter(triangle) / 2;
		
		double diffSideOne = semiPerimeter - triangle.getSideOne().defineLength();
		double diffSideTwo = semiPerimeter - triangle.getSideTwo().defineLength();
		double diffSideThree = semiPerimeter - triangle.getSideThree().defineLength();
		
		double area = Math.sqrt(semiPerimeter * diffSideOne * diffSideTwo * diffSideThree);
		
		logger.info("Area is " + area);
		
		return area;  		
	}
}
