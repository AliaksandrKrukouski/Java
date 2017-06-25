package by.krukouski.triangle.figure;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.krukouski.triangle.exception.IncorrectInputParameterException;
import by.krukouski.triangle.exception.InvalidTriangleException;
import by.krukouski.triangle.exception.TriangleIsBusyException;

public class FigureBuilder {
	private static Logger logger = LogManager.getLogger(SingleTriangle.class.getName());
	
	public static SingleTriangle buildTriangle(String points, String pointDelimiter, String coordinateDelimiter) throws InvalidTriangleException, IncorrectInputParameterException, TriangleIsBusyException {
		SingleTriangle triangle = null;
		
		String[] pointsArray = points.split(pointDelimiter);
		
		if (pointsArray.length != 3) {
			logger.error("Can not build triangle based on " + points + " separated by " + pointDelimiter);
			throw new IncorrectInputParameterException("Can not build triangle based on " + points + " separated by " + pointDelimiter);
		}
		
		Side sideOne = buildSide(pointsArray[0], pointsArray[1], coordinateDelimiter);
		Side sideTwo = buildSide(pointsArray[1], pointsArray[2], coordinateDelimiter);
		Side sideThree = buildSide(pointsArray[0], pointsArray[2], coordinateDelimiter);
		
		try {
			triangle = SingleTriangle.getTriangle();
			triangle.initTriangle(sideOne, sideTwo, sideThree); 
		} catch(InvalidTriangleException e) {
			triangle.releaseTriangle();
			throw e;
		}
		
		return triangle;
	}
	
	public static Side buildSide(String pointOneString, String pointTwoString, String delimiter) throws IncorrectInputParameterException {
		String[] pointOneXY = pointOneString.split(delimiter);
		String[] pointTwoXY = pointTwoString.split(delimiter);
		
		if (pointOneXY.length != 2 || pointTwoXY.length != 2 ) {
			logger.error("Can not build side based on (" + pointOneString + "),(" + pointOneString + ") separated by " + delimiter);
			throw new IncorrectInputParameterException("Can not build side based on (" + pointOneString + "),(" + pointOneString + ") separated by " + delimiter);
		}
		
		Point pointOne = new Point(Double.parseDouble(pointOneXY[0]), Double.parseDouble(pointOneXY[1]));
		Point pointTwo = new Point(Double.parseDouble(pointTwoXY[0]), Double.parseDouble(pointTwoXY[1]));
 
		Side side = new Side(pointOne, pointTwo);
		
		return side;
	}
}
