package Buoi6;

import java.util.Scanner;

public class hangthucpham extends hanghoa  {
public String ngaysanxuat;
public String ngayhethandung;
public void nhap(){
	super.nhap();
	System.out.print("Nhap ngay san xuat: ");
	Scanner sNhap= new Scanner(System.in);
	ngaysanxuat = sNhap.nextLine();
	System.out.print("Nhap ngay het han dung: ");
	ngayhethandung = sNhap.nextLine();
	
}
public void xuat(){
	super.xuat();
	System.out.println("Ngay san xuat: "+ngaysanxuat);
	System.out.println("Ngay het han dung: "+ngayhethandung);
	
}
}
