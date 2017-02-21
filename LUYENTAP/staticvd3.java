package LUYENTAP;

public class staticvd3 {
	 int rollno;  
     String name;  
     static String college = "BachKhoa";  
       
     static void change(){  
     college = "QuocGia";  
     }  
     staticvd3(int r, String n){  
     rollno = r;  
     name = n;  
     }  
  
     void display (){System.out.println(rollno+" "+name+" "+college);}  
  
    public static void main(String args[]){  
    	staticvd3.change();  
  
    	staticvd3 s1 = new staticvd3 (111,"Hoang");  
    	staticvd3 s2 = new staticvd3(222,"Thanh");  
    	staticvd3 s3 = new staticvd3 (333,"Nam");  
  
    s1.display();  
    s2.display();  
    s3.display();  
    }  
}
