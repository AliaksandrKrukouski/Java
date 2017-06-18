package by.krukouski.triangle;

public class Side {
	private Point pointOne;
	private Point pointTwo;  
    
	public Point getPointOne() {
		return pointOne;
	}
	
	public Point getPointTwo() {
		return pointTwo;
	}
	
	public Side(Point startPoint, Point endPoint) {
		this.pointOne = startPoint;
		this.pointTwo = endPoint;
	}

	public double defineLength() {
		double lengthX = pointOne.getX() - pointTwo.getX();
		double lengthY = pointOne.getY() - pointTwo.getY();
		 
		return Math.hypot(lengthX, lengthY);
	}
}
