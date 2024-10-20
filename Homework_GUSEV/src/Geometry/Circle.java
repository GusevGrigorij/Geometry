package Geometry;

public class Circle 
{
	private Point centre;
	private int radius;
	private boolean selected;
	public Point getCentre() {
		return centre;
	}
	public void setCentre(Point centre) {
		this.centre = centre;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public Circle() {
		super();
	}
	public Circle(Point centre) {
		super();
		this.centre = centre;
	}
	public Circle(Point centre, int radius) {
		super();
		this.centre = centre;
		this.radius = radius;
	}
	public Circle(Point centre, int radius, boolean selected) {
		super();
		this.centre = centre;
		this.radius = radius;
		this.selected = selected;
	}
	
	public double area()
	{
		return Math.PI*radius*radius;
	}
	
	public double circumference()
	{
		return 2*Math.PI*radius;
	}
}
