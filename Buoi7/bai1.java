package Buoi7;



 class hinhchunhat{
	public float cd;
	public float cr;
	public hinhchunhat(float cd,float cr){}
	
	
	public float chuvi(float cd, float cr){
		float chuvi;
		chuvi=(cd+cr)*2;
		System.out.println("Chu vi hinh chu nhat : "+chuvi);
		return chuvi;
	}
	public float dientich(float cd, float cr){
		float dientich;
		dientich=cd*cr;
		System.out.println("Dien tich hinh chu nhat: "+dientich);
		return dientich;
	}
}
 class hinhvuong{
	public float canh;
	
	public hinhvuong(float canh){}
	
	public float chuvi(float canh){
		float chuvi;
		chuvi=canh*4;
		System.out.println("Chu vi hinh chu nhat : "+chuvi);
		return chuvi;
	}
	public float dientich(float canh){
		float dientich;
		dientich=canh*canh;
		System.out.println("Dien tich hinh chu nhat: "+dientich);
		return dientich;
	}

}
public class bai1 {

	public static void main(String[] args) {
		hinhchunhat hcn=new hinhchunhat(2,3);		
		hcn.chuvi(2,3);
		hcn.dientich(2,3);
		hinhvuong hv=new hinhvuong(4);		
		hv.chuvi(4);
		hv.dientich(4);
		

	}

}
