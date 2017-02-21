package Buoi6;

import java.util.Scanner;

public abstract class nhanvien {
public String manv;
public String ten;
public String trinhdo;
public float luongcb;
public void Nhap(){
	System.out.print("Nhap ma nhan vien: ");
	Scanner sNhap= new Scanner(System.in);
	manv = sNhap.nextLine();
	System.out.print("Nhap ten nhan vien: ");		
	ten = sNhap.nextLine();
	System.out.print("Nhap trinh do: ");		
	trinhdo =sNhap.nextLine();	
	System.out.print("Nhap luong: ");		
	luongcb =sNhap.nextFloat();	
}
public void Xuat(){
	System.out.println("\nThong tin nhan vien: \n");
	System.out.println("Ma nv: "+manv);
	System.out.println("Ten nv: "+ten);
	System.out.println("Trinh do: "+trinhdo);
	System.out.println("Luong: "+luongcb);
}
abstract public float TinhLuong();	
}
