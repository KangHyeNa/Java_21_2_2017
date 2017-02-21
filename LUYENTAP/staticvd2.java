package LUYENTAP;

public class staticvd2 {
	static int count=0; //se lay bo nho (memory) khi bien instance duoc tao  
	 //Ket qua thuc hien chuong trinh hien ra 3 so 1 o 3 dong 
	staticvd2(){  
	count++;  
	System.out.println(count);  
	}  
	  
	public static void main(String args[]){  
	  
	staticvd2 c1=new staticvd2();  
	staticvd2 c2=new staticvd2();  
	staticvd2 c3=new staticvd2();  
	  
	 }  
}
