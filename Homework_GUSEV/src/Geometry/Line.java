package Geometry;

public class Line 
{
	private Point startPoint;
	private Point endPoint;
	private boolean selected;
	
	public Point getStartPoint() {
		return startPoint;
	}
	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}
	public Point getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	public Line() {
		super();
	}
	public Line(Point startPoint) {
		super();
		this.startPoint = startPoint;
	}
	public Line(Point startPoint, Point endPoint) {
		super();
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	public Line(Point startPoint, Point endPoint, boolean selected) {
		super();
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.selected = selected;
	}
	
	public double length() 
	{
		return Math.sqrt((this.endPoint.getX() - this.startPoint.getX())*(this.endPoint.getX() - this.startPoint.getX()) + (this.endPoint.getY() - this.startPoint.getY()) * (this.endPoint.getY() - this.startPoint.getY()));
	}
	
}
