abstract class Shape {
	String color;

	abstract double area();
	// abstract class can have the constructor
	public Shape(String color)
	{
		System.out.println("Shape constructor called");
		this.color = color;
	}

	// this is a concrete method
	public String getColor() 
	   { 
		return color;
	   }
}
class Circle extends Shape {
	double radius;

	public Circle(String color, double radius)
	{

		super(color);
		System.out.println("Circle constructor called");
		this.radius = radius;
	}

	 double area()
	{
		return 15.2;
	}
 public String toString()
	{
		return color;
	}
	
}
class Rectangle extends Shape {

	double length;
	double width;

	public Rectangle(String color, double length,
					double width)
	{
		super(color);
		System.out.println("Rectangle constructor called");
		this.length = length;
		this.width = width;
	}

	double area() { return length * width; }

    public String toString()
	{
		return color ;
	}
}
public class Main {
	public static void main(String[] args)
	{
		
		Shape s1 = new Circle("Red", 2.2);
		Shape s2 = new Rectangle("Yellow", 2, 4);

		System.out.println(s1);
		System.out.println(s2);
	}
}
