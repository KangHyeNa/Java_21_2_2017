package Buoi7;

abstract class hinhhoc
	
{	public double dt, cv;
	abstract void DienTich();
	abstract void ChuVi();
	void Xuat()
	{
		System.out.println("Chu vi la: "+cv);
		System.out.println("Dien tich la: "+dt);

	}
}
class HCN extends hinhhoc
{	int dai,rong;
	HCN(int d, int r)
	{
		super();
		dai=d;
		rong=r;
	}
	void DienTich()
	{
		dt=dai*rong;
	}
	void ChuVi()
	{
		cv=(dai+rong)*2;
	}
	void Xuat()
	{
		super.Xuat();
		
		
	}
}
class HV extends hinhhoc
{
	int canh;
	HV(int c)
	{
		super();
		canh=c;
	}
	void DienTich()
	{
		dt=canh*canh;
	}
	void ChuVi()
	{
		cv=canh*4;
	}
	void Xuat()
	{
		super.Xuat();	
		
	}
}
public class bai11 {

	public static void main(String[] args) {
		System.out.println("Chu vi dien tich HCN la:");
		HCN hcn=new HCN(2,3);		
		hcn.DienTich();
		hcn.ChuVi();
		hcn.Xuat();
		System.out.println("Chu vi dien tich HV la:");
		HV hv=new HV(4);		
		hv.DienTich();
		hv.ChuVi();
		hv.Xuat();
		
	}

}
