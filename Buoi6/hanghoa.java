package Buoi6;

import java.util.Scanner;

public class hanghoa {
	public  String mahang;
	public String tenhang;
	public float gia;
	public  void nhap(){
		System.out.print("Nhap ma hang: ");
		Scanner sNhap= new Scanner(System.in);
		mahang = sNhap.nextLine();
		System.out.print("Nhap ten hang: ");		
		tenhang = sNhap.nextLine();
		System.out.print("Nhap gia: ");		
		gia =sNhap.nextFloat();		
	}
	public void xuat(){
		System.out.println("\nThong tin san pham: \n");
		System.out.println("Ma hang: "+mahang);
		System.out.println("Ten hang: "+tenhang);
		System.out.println("Gia la: "+gia);
	}
}

