package In;

class Shape {
	String color;
	double borderwidth;
	
	Shape()
	{
		color="Red";
		borderwidth=2.5;
	}
	
	Shape(String color, double borderwidth)
	{
		this.color = color;
		this.borderwidth = borderwidth;
	}

	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	double getBorderwidth() {
		return borderwidth;
	}

	void setBorderwidth(double borderwidth) {
		this.borderwidth = borderwidth;
	}
	
	void display()
	{
		System.out.println("\nColor is : "+this.color);
		System.out.println("Border Width is : "+this.borderwidth);
	}
	
}//Shape class ends here

class Rectangle extends Shape
{
	double length;
	double width;
	
	Rectangle()
	{
		super();
		length=2.6;
		width=1.8;
	}

	Rectangle(String color, double borderwidth, double length, double width)
	{
		super(color,borderwidth);
		this.length = length;
		this.width = width;
	}

	double getLength() {
		return length;
	}

	void setLength(double length) {
		this.length = length;
	}

	double getWidth() {
		return width;
	}

	void setWidth(double width) {
		this.width = width;
	}
	
	
	void display()
	{
		super.display();
		System.out.println("Length is : "+this.length);
		System.out.println("Width is : "+this.width);
	}
	
}//Rectangle class ends here

class Triangle extends Shape
{
	double base;
	double height;
	
	
	Triangle()
	{
		super();
		base=12;
		height=7;
	}


	Triangle(String color, double borderwidth, double base, double height) 
	{
		super(color,borderwidth);
		this.base = base;
		this.height = height;
	}


	double getBase() {
		return base;
	}


	void setBase(double base) {
		this.base = base;
	}


	double getHeight() {
		return height;
	}


	void setHeight(double height) {
		this.height = height;
	}
	
	
	void display()
	{
		super.display();
		System.out.println("Base is : "+this.base);
		System.out.println("Height is : "+this.height);
	}
	

}//Triangle class ends here

class Circle extends Shape
{
	double radius;
	
	Circle()
	{
		super();
		radius=5;
	}

	Circle(String color, double borderwidth, double radius) 
	{
		super(color,borderwidth);
		this.radius = radius;
	}

	double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}
	
	void display()
	{
		super.display();
		System.out.println("Radius is : "+this.radius);
	}
	
}//Circle class ends here

class TestShape
{
	public static void main(String[]args) {
		Shape s1=new Shape();
		s1.display();
		
		Rectangle r1=new Rectangle("Yellow",2.5,12,8);
		r1.display();
		
		Triangle t1=new Triangle();
		t1.display();
		
		Circle c1=new Circle("Black",2.4,4);
		c1.display();
	}
}