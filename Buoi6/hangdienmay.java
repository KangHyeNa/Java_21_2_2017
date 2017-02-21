package Buoi6;

import java.util.Scanner;

public class hangdienmay extends hanghoa{
public String thoigianbaohanh;
public int dienap;
public int congsuat;
public void nhap(){
	super.nhap();
	System.out.print("Nhap thoi gian bao hanh: ");
	Scanner sNhap= new Scanner(System.in);
	thoigianbaohanh = sNhap.nextLine();
	System.out.print("Nhap dien ap: ");
	dienap = sNhap.nextInt();
	System.out.print("Nhap cong suat: ");
	congsuat =sNhap.nextInt();
}
public void xuat(){
	super.xuat();
	System.out.println("Thoi gian bao hanh: "+thoigianbaohanh);
	System.out.println("Dien ap: "+dienap);
	System.out.println("Cong suat: "+congsuat);
}
}
