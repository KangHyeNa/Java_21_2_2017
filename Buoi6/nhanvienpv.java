package Buoi6;



public class nhanvienpv extends nhanvien {
	public void Nhap()
	{
		super.Nhap();
		
	}
	public void Xuat(){
		super.Xuat();
		
	}
	public float TinhLuong(){			
		float Luong;
		Luong= luongcb;		
		System.out.println("Luong: "+Luong);
		return Luong;
	}
}
