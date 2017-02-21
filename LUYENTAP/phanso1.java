package LUYENTAP;
//2 phan so co cung mau so
public class phanso1 {
	private int tu,mau;
	public void settu(int tu)
	{
		this.tu=tu;
	}
	public void setmau(int mau)
	{
		this.mau=mau;
	}
	public int gettu()
	{
		return this.tu;
	}
	public int getmau()
	{
		return this.mau;
	}
	public phanso1 cong(phanso1 p1,phanso1 p2)
	{//dinh nghia cach cong 2 phan so co cung mau so
		phanso1 p=new phanso1();
		p.tu=p1.gettu()+p2.gettu();
		p.mau=p1.getmau();
		return p;
	}
	public static void main(String []args)
	{// tao 2 dtg thuoc lop phanso1
		phanso1 p1=new phanso1();
		phanso1 p2=new phanso1();
		//goi ham
		p1.settu(3);
		p1.setmau(7);
		p2.settu(5);
		p2.setmau(7);
		// goi phuong thuc cong
		System.out.println(p1.cong(p1, p2).gettu() + " / " + p1.cong(p1, p2).getmau());
	}

}
