package Buoi6;

import java.util.Scanner;

public class nhanvienquanli extends nhanvien {
private String chuyenmon;
private float phucapcv;
public void Nhap()
{
	super.Nhap();
	System.out.print("Nhap chuyen mon: ");
	Scanner sNhap= new Scanner(System.in);
	chuyenmon = sNhap.nextLine();
	System.out.print("Nhap phu cap: ");		
	phucapcv = sNhap.nextFloat();	
}
public void Xuat(){
	super.Xuat();
	System.out.println("Chuyen mon: "+chuyenmon);
	System.out.println("Phu cap: "+phucapcv);
}
public float TinhLuong(){
	float Luong;
	Luong= luongcb+phucapcv;
	System.out.println("Luong: "+Luong);
	return Luong;
	
}
}
