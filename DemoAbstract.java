/*Program to create an abstract class Figure with following properties and functions:
	Properties Double dim1
	Methods:abstract void findArea()
			abstract void findPerimeter();
	
	Create three subclasses Circle,Rectangle and Triangle that extends Figure class
	and define bothe the methods.
	Write a program that will find the area and perimeter of 3 figures and print details
	of all.		
*/
package mypackage;
import java.util.Scanner;

	//Creation of abstract class  with two abstract methods
	abstract class Figure
		{
		double dim1;
		abstract void findArea();
		abstract void findPerimeter();
		}
	//Defining class Circle
	class Circle extends Figure
		{
		Circle(double r)
		{
		dim1=r;
		}
		//calculation of area for circle
		void findArea()
			{		
		System.out.println("The area of Circle is :"+(3.14*(dim1*dim1)));	
			}
		//calculation perimeter for circle
		void findPerimeter()
		{		
			System.out.println("The Perimiter of circle is :"+ (2*3.14*dim1));	
		}
		
		}
		
	
	class Rectangle extends Figure
	{
		double dim2;
		Rectangle(double len,double wid)
			{
			dim1=len;
			dim2=wid;
			}
		//calculation of area for rectangle
		void findArea()
		{		
			System.out.println("The area of Rectangle is :"+(dim1*dim2));	
		}
		//calculation of perimeter for Rectangle
		void findPerimeter()
		{		
			System.out.println("The Perimeter of Rectangle is "+(2*(dim1+dim2)));	
		}
	
	}
	

	class Triangle extends Figure
	{
		double dim2;
		double dim3;
		double height;
		Triangle(double h,double side1,double side2, double baseside3)
			{
			dim1=side1;
			dim2=side2;
			dim3=baseside3;
			height=h;
			
			}
		//calculation of area for Triangle
		void findArea()
		{		
			System.out.println("The area of Triangle is :"+((dim3*height)/2));	
		}
		//calculation of perimeter for Triangle
		void findPerimeter()
		{		
			System.out.println("The Perimeter of Triangle is "+(dim1+dim2+dim3));	
		}
	
	}
	
	
		
public class DemoAbstract {

	//Declaration of Main method
	public static void main(String[] args) {
		double radius;
		double lenth;
		double width;
		double side1,side2,side3,height;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the radius of circle:");
		radius =sc.nextDouble();
		//Creatomg Refernce of Figure class
		Figure f;
		
		//Creating an object circle class and referring to parent class reference
		f=new Circle(radius);
		//Calling the area method for circle
		f.findArea();
		//Calling the perimeter method for circle
		f.findPerimeter();
		
		System.out.println();
		System.out.println("***************************");
		
		System.out.println("Enter the lenth of Rectangle:");
		lenth=sc.nextDouble();
		System.out.println("Enter the width of Rectangle:");
		width=sc.nextDouble();
		f=new Rectangle(lenth,width);
		//Calling the area method for Rectangle
		f.findArea();
		//Calling the perimeter method for Rectangle
		f.findPerimeter();
		
		System.out.println();
		System.out.println("***************************");
		System.out.println("Enter the side1 of Triangle:");
		side1=sc.nextDouble();
		System.out.println("Enter the side2 of Triangle:");
		side2=sc.nextDouble();
		System.out.println("Enter the side3(base) of Triangle:");
		side3=sc.nextDouble();
		System.out.println("Enter the height of Triangle:");
		height=sc.nextDouble();
		
		//Calling the area method for Rectangle
		f=new Triangle(height,side1,side2,side3);
		//Calling the area method for Rectangle
		f.findArea();
		//Calling the perimeter method for Traingle
		f.findPerimeter();
	}

}//End of Program
