package by.krukouski.triangle.figure;

public class Side {
	private Point pointOne;
	private Point pointTwo;  
	
	public Side(Point startPoint, Point endPoint) {
		this.pointOne = startPoint;
		this.pointTwo = endPoint;
	}
	
	public Point getPointOne() {
		return pointOne;
	}

	public void setPointOne(Point pointOne) {
		this.pointOne = pointOne;
	}

	public Point getPointTwo() {
		return pointTwo;
	}

	public void setPointTwo(Point pointTwo) {
		this.pointTwo = pointTwo;
	}

	public double defineLength() {
		double lengthX = pointOne.getX() - pointTwo.getX();
		double lengthY = pointOne.getY() - pointTwo.getY();
		 
		return Math.hypot(lengthX, lengthY);
	}
}
