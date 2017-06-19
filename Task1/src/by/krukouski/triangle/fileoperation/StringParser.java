package by.krukouski.triangle.fileoperation;

import by.krukouski.triangle.exception.InvalidTriangleException;
import by.krukouski.triangle.figure.Point;
import by.krukouski.triangle.figure.Side;
import by.krukouski.triangle.figure.Triangle;

public class StringParser {
	public static String[] split(String string, String delimiter) {
		String[] splitString = string.split(delimiter); 
		return splitString;
	}
	
	public static Side buildSide(String pointOneString, String pointTwoString) {		
		String[] pointOneXY = pointOneString.split(",");
		String[] pointTwoXY = pointTwoString.split(",");
		
		Point pointOne = new Point(Double.parseDouble(pointOneXY[0]), Double.parseDouble(pointOneXY[1]));
		Point pointTwo = new Point(Double.parseDouble(pointTwoXY[0]), Double.parseDouble(pointTwoXY[1]));
 
		Side side = new Side(pointOne, pointTwo);
		
		return side;
	}
	
	public static Triangle buildTriangle(String pointsString) throws InvalidTriangleException {
		String[] points = pointsString.split(";"); 
		
		Side sideOne = buildSide(points[0], points[1]);
		Side sideTwo = buildSide(points[0], points[2]);
		Side sideThree = buildSide(points[1], points[2]);
		
		Triangle triangle = new Triangle(sideOne, sideTwo, sideThree); 
		
		return triangle;
	} 
}
