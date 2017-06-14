package by.krukouski.triangle;

import java.util.ArrayList;

public class Triangle {
	private ArrayList<Point> points = new ArrayList<Point>();
	private ArrayList<Side> sides = new ArrayList<Side>();
	
	public Triangle(ArrayList<Point> points, ArrayList<Side> sides) {
		this.points = points;
		this.sides = sides;
	}
	
	public ArrayList<Point> getPoints() {
		return points;
	}
	public void setPoints(ArrayList<Point> points) {
		this.points = points;
	}
	public ArrayList<Side> getSides() {
		return sides;
	}
	public void setSides(ArrayList<Side> sides) {
		this.sides = sides;
	}
	
	
}
