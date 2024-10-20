package Geometry;

public class Test 
{

	public static void main(String[] args) 
	{
		Point Point1 = new Point(5, 6);
		Point Point2 = new Point(7, 8);
		Line Line = new Line(Point1, Point2);
		System.out.println(Line.length());
		Rectangle Rectangle = new Rectangle(Point1, 23, 52);
		System.out.println(Rectangle.area());
		System.out.println(Rectangle.circumference());
		Circle Circle = new Circle(Point1, 81);
		System.out.println(Circle.area());
		System.out.println(Circle.circumference());
	}

}
