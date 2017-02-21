package mega645;

import java.util.Scanner;

public class mega645dangmang {

	public static void main(String[] args) {
		Scanner sNhap =new Scanner(System.in);
		 
		System.out.println("Chon con so dau tien");
		  int s1=sNhap.nextInt();	     
		  while (s1<1||s1>45)
		     {
		    	 System.out.println("Chon con so dau tien"); 
		         s1=sNhap.nextInt();        
		         
		     }
		  
		  System.out.println("Chon con so thu hai");
		  int s2=sNhap.nextInt();
		  while(s2<1||s2>45||s2==s1)
		  { 
		     System.out.println("Chon con so thu hai");
		     s2=sNhap.nextInt();
		  }
		  System.out.println("Chon con so thu ba");
		  int s3=sNhap.nextInt();
		  while(s3<1||s3>45||s3==s2||s3==s1)
		  {
		     System.out.println("Chon con so thu ba");
		     s3=sNhap.nextInt();
		  }
		  System.out.println("Chon con so thu tu");
		  int s4=sNhap.nextInt();
		  while(s4<1||s4>45||s4==s3||s4==s2||s4==s1) 
		  {
		     System.out.println("Chon con so thu tu");
		     s4=sNhap.nextInt();
		  }
		  System.out.println("Chon con so thu nam");
		  int s5=sNhap.nextInt();
		  while(s5<1||s5>45||s5==s4||s5==s3||s5==s2||s5==s1) 
		  {
		     System.out.println("Chon con so thu nam");
		     s5=sNhap.nextInt();
		  }
		  System.out.println("Chon con so thu sau");
		  int s6=sNhap.nextInt();
		  while(s6<1||s6>45||s6==s5||s6==s4||s6==s3||s6==s2||s6==s1) 
		  {
		     System.out.println("Chon con so thu sau");
		     s6=sNhap.nextInt();
		  }
		  System.out.println("Ket qua ban chon \n"); 
		  System.out.println("Ket qua con so thu nhat "+s1);
		  System.out.println("Ket qua con so thu hai "+s2);
		  System.out.println("Ket qua con so thu ba "+s3);
		  System.out.println("Ket qua con so thu tu "+s4);
		  System.out.println("Ket qua con so thu nam "+s5);
		  System.out.println("Ket qua con so thu sau "+s6);
		  

	}

}
