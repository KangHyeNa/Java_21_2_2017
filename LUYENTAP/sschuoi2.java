package LUYENTAP;

public class sschuoi2 {
	public static void main(String args[]){  
		   String s1="Vietjack";  
		   String s2="Vietjack";  
		   String s3=new String("Vietjack");  
		   System.out.println(s1==s2);//true (boi vi ca hai cung tham chieu toi cung instance)  
		   System.out.println(s1==s3);//false(boi vi s3 tham chieu toi instance duoc tao khong phai trong Pool)  
		 }  
}
