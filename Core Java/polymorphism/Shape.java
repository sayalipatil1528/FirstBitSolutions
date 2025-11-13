package polymorphism;

class Shape {
	String color;
	double borderwidth;
	double area;
	
	Shape()
	{
		color="Red";
		borderwidth=2.5;
		area=12;
	}
	
	Shape(String color, double borderwidth,double area)
	{
		this.color = color;
		this.borderwidth = borderwidth;
		this.area=area;
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
	
	
	double getArea() {
		return area;
	}

	void setArea(double area) {
		this.area = area;
	}

	double calArea()
	{
		return area;
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

	Rectangle(String color, double borderwidth, double length, double width,double area)
	{
		super(color,borderwidth,area);
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
	
	double calArea()
	{
		return length*width;
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


	Triangle(String color, double borderwidth, double base, double height,double area) 
	{
		super(color,borderwidth,area);
		this.base = base;
		this.height = height;
		this.area=area;
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
	
	double calArea()
	{
		return 0.5*base*height;
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

	Circle(String color, double borderwidth, double radius,double area) 
	{
		super(color,borderwidth,area);
		this.radius = radius;
		this.area=area;
	}

	double getRadius() {
		return radius;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}
	
	double calArea()
	{
		return 3.14*radius*radius;
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
		Shape s1;//generic reference
		s1=new Shape();
		s1.display();
		System.out.println("Shape : "+s1.calArea());
		
		s1=new Rectangle("Yellow",2.5,12,8,1);//upcasting
		s1.display();
		System.out.println("Shape : "+s1.calArea());
		
		s1=new Triangle();//upcasting
		s1.display();
		System.out.println("Shape : "+s1.calArea());
		
		s1=new Circle("Black",2.4,4,1);//upcasting
		s1.display();
		System.out.println("Shape : "+s1.calArea());
	}
}
