package Geometry;

public class Point 
{
	private int x;
	private int y;
	private boolean selected;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	public Point() {
		super();
	}
	public Point(int x) {
		super();
		this.x = x;
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Point(int x, int y, boolean selected) {
		super();
		this.x = x;
		this.y = y;
		this.selected = selected;
	}
	
	
	
}
