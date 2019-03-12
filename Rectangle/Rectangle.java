//Consider a Rectangle Shape.
//Identify its properties and behaviours and implement the same.
//Write a Test Cases to check if the behaviours(methods) are implemented properly.
//If their are 2 Rectangle objects of different sizes than we should be able to check if they are having same area or not.

//Test the Program with different combinations test cases possible.




public class Rectangle
{
	double lengthofRectangle;
	double breadthofRectangle;

	public Rectangle(double lengthofRectangle,double breadthofRectangle){
		this.lengthofRectangle=lengthofRectangle;
		this.breadthofRectangle=breadthofRectangle;
	}
 	public double area()
	{
		return lengthofRectangle*breadthofRectangle;
	}
	public double perimeter()
	{
		return lengthofRectangle*breadthofRectangle;
	}
	public void display()
	{
		System.out.println("area of a rectangle is"+area());
		System.out.println("perimter of rectangle is"+perimeter());
	}
}
