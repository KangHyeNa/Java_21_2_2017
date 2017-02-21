package Buoi6;

public class Bai3 {
	public static void main (String[] args) {	
		System.out.println("Nhan vien nghien cuu: \n");
		nhanviennc nvnc = new nhanviennc();
		nvnc.Nhap();
		nvnc.Xuat();
		nvnc.TinhLuong();
		System.out.println("Nhan vien phuc vu: \n");
		nhanvienpv nvpv = new nhanvienpv();
		nvpv.Nhap();
		nvpv.Xuat();
		nvnc.TinhLuong();
		System.out.println("Nhan vien quan li: \n");
		nhanvienquanli nvql = new nhanvienquanli();
		nvql.Nhap();
		nvql.Xuat();
		nvnc.TinhLuong();
	}
}
