package LUYENTAP;

public class staticvd {
	 
		int count=0; //se lay bo nho (memory) khi bien instance duoc tao  
		 //Ket qua thuc hien chuong trinh hien ra 3 so 1 o 3 dong 
		staticvd(){  
		count++;  
		System.out.println(count);  
		}  
		  
		public static void main(String args[]){  
		  
		staticvd c1=new staticvd();  
		staticvd c2=new staticvd();  
		staticvd c3=new staticvd();  
		  
		 }  
		}  

