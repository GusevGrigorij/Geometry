package Geometry;

public class Rectangle 
{
	private Point startPoint;
	private int width;
	private int height;
	private boolean selected;
	public Point getStartPoint() {
		return startPoint;
	}
	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	public Rectangle() {
		super();
	}
	public Rectangle(Point startPoint) {
		super();
		this.startPoint = startPoint;
	}
	public Rectangle(Point startPoint, int width) {
		super();
		this.startPoint = startPoint;
		this.width = width;
	}
	public Rectangle(Point startPoint, int width, int height) {
		super();
		this.startPoint = startPoint;
		this.width = width;
		this.height = height;
	}
	public Rectangle(Point startPoint, int width, int height, boolean selected) {
		super();
		this.startPoint = startPoint;
		this.width = width;
		this.height = height;
		this.selected = selected;
	}
	
	public int area() 
	{
		return this.height*this.width;
	}
	
	public int circumference() 
	{
		return (this.height+this.width)*2;
	}
}
