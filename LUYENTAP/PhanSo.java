package LUYENTAP;
// 2 phan so khac mau so
public class PhanSo {
	
	private int tu, mau;// thuoc tinh lop
	 public PhanSo(int tu, int mau)//bo khoi tao
	 {
	  this.tu=tu;
	  this.mau=mau;
	 }
	 
	 public void setTu(int tu)
	 {
	  this.tu=tu;
	 }
	 public void setMau(int mau)
	 {
	  this.mau=mau;
	 }
	 public int getTu()
	 {
	  return this.tu;
	 }
	 public int getMau()
	 {
	  return this.mau;
	 }
	 public int USCLN(int a, int b)//tim ucln de lay mau so chung
	 {
	  while(a!=b)
	  {
	   if(a>b) 
		   a=a-b;
	   else 
		   b=b-a;
	  }
	   return a;//a=b
	 }
	 public void rutGon()
	 {
	  int i=USCLN(this.getTu(),this.getMau());//ucln cua tu va mau
	  this.setTu(this.getTu()/i);
	  this.setMau(this.getMau()/i);
	 }
	 public void congPS(PhanSo ps)
	 {//dinh nghia cong thuc tinh cong phan so
	  int a=(this.getTu()*ps.getMau()) + (ps.getTu()*this.getMau());
	  int b=ps.getMau()*this.getMau();
	  PhanSo k = new PhanSo(a,b);
	  //System.out.println(k.tu+"/"+k.mau);
	  k.rutGon();
	  System.out.println("Ket qua Cong: " + k.tu + "/" + k.mau);
	 }
	 public void truPS(PhanSo ps)
	 {
	  int a=(this.getTu()*ps.getMau()) - (ps.getTu()*this.getMau());
	  int b=ps.getMau()*this.getMau();
	  PhanSo k=new PhanSo(a,b);
	  k.rutGon();
	  System.out.println("Ket qua Tru: " + k.tu + "/" + k.mau);
	 }
	 public void nhanPS(PhanSo ps)
	 {
	  int a=ps.tu*this.tu;
	  int b=ps.mau*this.mau;
	  PhanSo k=new PhanSo(a,b);
	  k.rutGon();
	  System.out.println("Ket qua Nhan: " + k.tu + "/" + k.mau);
	 }
	 public void chiaPS(PhanSo ps)
	 {
	  int a=this.tu*ps.mau;
	  int b=this.mau*ps.tu;
	  PhanSo k=new PhanSo(a,b);
	  k.rutGon();
	  System.out.println("Ket qua Chia: " + k.tu + "/" + k.mau);
	 }
	 public static void main(String[] args)
	 {// tao doi tuong 
	  PhanSo ps1=new PhanSo(16,4);
	  PhanSo ps2=new PhanSo(4,8);
	  //thong tin phan so 1
	  System.out.println("Phan so thu nhat : " + ps1.tu + "/" + ps1.mau);
	  System.out.println("USCLN: " + ps1.USCLN(ps1.tu,ps1.mau));
	  ps1.rutGon();
	  System.out.println("Phan so sau khi rut gon : " + ps1.tu + "/" + ps1.mau);
	  // thong tin phan so 2
	  System.out.println("Phan so thu hai: " + ps2.tu + "/" + ps2.mau);
	  System.out.println("USCLN: " + ps2.USCLN(ps2.tu,ps2.mau));
	  ps2.rutGon();
	  System.out.println("Phan so sau khi rut gon : " + ps2.tu + "/" + ps2.mau);	
	  // thuc hien phep tinh
	  ps1.congPS(ps2);
	  ps1.truPS(ps2);
	  ps1.nhanPS(ps2);
	  ps1.chiaPS(ps2);
	 }
}
