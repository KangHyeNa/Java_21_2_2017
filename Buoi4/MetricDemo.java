package Buoi4;

import java.util.Scanner;

public class MetricDemo {
	
	public static void main(String[] args) {
		double kqm;
	    double kqk;
		System.out.println("Nhap miles: ");
		Scanner sNhap = new Scanner(System.in);
	    int miles = sNhap.nextInt();
		System.out.println("Nhap kilos: ");		
	    int kilos = sNhap.nextInt();	    
		kqm=Metric.kilometersToMiles(kilos);
		kqk=Metric.milesToKilometers(miles);
		System.out.printf("%,.2f miles equals %,.2f kilometers.",kqm,kqk);
		System.out.printf("\n%,.2f kilos equals %,.2f miles.",kqk,kqm);
	}
}
