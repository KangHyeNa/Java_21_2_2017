package Buoi6;

public class Bai1 {
	public static void main (String[] args) {	
		System.out.println("Thong tin san pham cua hang dien may: \n");
		hangdienmay hdm =new hangdienmay();
		hdm.nhap();
		hdm.xuat();
		System.out.println("\nThong tin san pham cua hang thuc pham: \n");
		hangthucpham htp = new hangthucpham();
		htp.nhap();
		htp.xuat();
		System.out.println("\nThong tin san pham cua hang sanh su: \n");
		hangsanhsu hss =new hangsanhsu();
		hss.nhap();
		hss.xuat();
	}
}
