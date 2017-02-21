package Buoi6;

import java.util.Scanner;

public class hangsanhsu extends hanghoa {
public String loainguyenlieu;
public void nhap(){
	super.nhap();
	System.out.print("Nhap loai nguyen lieu: ");
	Scanner sNhap= new Scanner(System.in);
	loainguyenlieu = sNhap.nextLine();
	
}
public void xuat(){
	super.xuat();
	System.out.println("Loai nguyen lieu: "+loainguyenlieu);
	
}
}
