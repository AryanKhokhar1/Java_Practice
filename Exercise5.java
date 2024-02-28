// package com.Calculator;

class Rectangle {
	double height;
	double width;
	Rectangle(double height, double width){
		this.height = height;
		this.width = width;
	}
	double Area(){
		return this.height * this.width;
	}
	double Perimeter(){
		return 2*(this.height + this.width);
	}
}
class Square{
	double length;
	Square(double length){
		this.length = length;
	}
	double Area(){
		return this.length * this.length;
	}
	double Perimeter(){
		return this.length*4;
	}
}
class Circle {
	double radius;
	double pi = 3.14;
	Circle(){
		System.out.println("circle without argument");
	}
	Circle(double radius){
		System.out.println("circle with argument");
		this.radius = radius;
	}
	double Perimeter(){
		return 2*pi*this.radius;
	}
	double Area(){
		System.out.println("Area");
		return pi*this.radius*this.radius;
	}
}
class Cylinder extends Circle {
	double radius;
	double height;
	Cylinder(double radius , double height){
		super(radius);
		this.radius = radius;
		this.height = height;

	}
	double TotalSurfaceArea(){
		return super.Perimeter()*(this.height + this.radius);
	}
	double CurvedSurfaceArea(){
		return super.Perimeter()*this.height;
	}
}
class Sphere extends Circle {
	double radius;
	Sphere(double radius){
		super(radius);
		this.radius = radius;
		System.out.println("Sphere");
	}
	double Volume(){
		return super.Area()*this.radius;
	}
}
class Exercise5{
	 
	public static void main(String[] arg){
		Sphere cr = new Sphere(5);
		Cylinder cyl = new Cylinder(2.3, 5);
		System.out.println("Volume: "+cr.Volume());
		System.out.println("Cylinder: "+cyl.TotalSurfaceArea());
	}
}