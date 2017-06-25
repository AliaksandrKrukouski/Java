package by.krukouski.triangle.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.krukouski.triangle.figure.Triangle;

public class Perimeter {
	private static Logger logger = LogManager.getLogger(Perimeter.class.getName());
	
	public static double definePerimeter(Triangle triangle) {
		double perimeter = triangle.getSideOne().defineLength() + triangle.getSideTwo().defineLength() + triangle.getSideThree().defineLength();
		
		logger.info("Perimeter is " + perimeter);
		
		return perimeter;
	}
	
}