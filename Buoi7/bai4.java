package Buoi7;
interface GiaoDienDongVat
{
	String TEN_GIAO_DIEN="giaodiendongvat";
	void tuGioiThieu();
}
class Meo implements GiaoDienDongVat
{
	public void tuGioiThieu()
	{
		System.out.println("Xin chao! Toi la Doremon thuoc ho nha meo");
	}
}
class Chuot implements GiaoDienDongVat
{
	public void tuGioiThieu()
	{
		System.out.println("Toi duoc cai dat tu giao dien dong vat va noi duoc tieng Viet "+TEN_GIAO_DIEN);
	}
}
public class bai4 {

	public static void main(String[] args) {
		Meo cat=new Meo();
		cat.tuGioiThieu();
		Chuot mouse=new Chuot();
		mouse.tuGioiThieu();

	}

}
