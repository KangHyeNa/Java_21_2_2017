package Buoi7;



import java.util.Scanner;

interface ShapeInterface
{
	public double pi=3.14;
	public double calcArea();
	public double calcPerimeter();
}
interface IO_Interface
{
	void input();
	void output();
}

class Retangle implements ShapeInterface,IO_Interface
{
	double h;
	double w;
	double s;
	double p;
	Scanner input=new Scanner(System.in);
	@Override
	public void input() {
		System.out.println("nhap vao height: ");
		h=input.nextDouble();
		System.out.println("nhap vao width: ");
		w=input.nextDouble();
	}

	@Override
	public void output() {
	System.out.println("Chu vi la: "+p);
	System.out.println("Dien tich la: "+s);
		
	}

	@Override
	public double calcArea() {
		s=h*w;
		return 0;
	}

	@Override
	public double calcPerimeter() {
		p=(h+w)*2;
		return 0;
	}
}
class Circle implements ShapeInterface,IO_Interface
{
	double r;
	double s;
	double p;
	Scanner input=new Scanner(System.in);
	@Override
	public void input() {
		System.out.println("nhap vao radius: ");
		r=input.nextDouble();
	}

	@Override
	public void output() {
		System.out.println("Chu vi la: "+p);
		System.out.println("Dien tich la: "+s);
	}

	@Override
	public double calcArea() {
		s=r*r*pi;
		return 0;
	}

	@Override
	public double calcPerimeter() {
		p=r*2*pi;
		return 0;
	}
		
}
public class bai5 {
	public static void main(String[] args)
	{
		Retangle hcn=new Retangle();
		hcn.input();
		hcn.calcArea();
		hcn.calcPerimeter();
		hcn.output();
		Circle ht=new Circle();
		ht.input();
		ht.calcArea();
		ht.calcPerimeter();
		ht.output();
	}
}

