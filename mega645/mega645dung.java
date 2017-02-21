package mega645;

import java.util.Random;
import java.util.Scanner;

public class mega645dung {

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
		
		Random r=new Random();
		int n=1,m=45;			
		int a, a1, a2,a3,a4,a5;	
		System.out.println("\nKet qua \n"); 
		a = n+r.nextInt(m-n+1);	
		System.out.println("Ket qua con so thu nhat "+a);
		a1=n+r.nextInt(m-n+1);			  
		while(a1==a)
				{				
				a1=n+r.nextInt(m-n+1);	
				}			
		System.out.println("Ket qua con so thu hai "+a1);
					
		a2=n+r.nextInt(m-n+1);	
		
			while(a2==a1||a2==a)
			{				
			a2=n+r.nextInt(m-n+1);	
			}					
		System.out.println("Ket qua con so thu ba "+a2);					
		a3=n+r.nextInt(m-n+1);			
				while(a2==a1||a2==a||a3==a2)
				{				
				a3=n+r.nextInt(m-n+1);	
			    }					
		System.out.println("Ket qua con so thu tu "+a3);
		a4=n+r.nextInt(m-n+1);		
			while(a4==a||a4==a1||a4==a2||a4==a3)
			{				
			a4=n+r.nextInt(m-n+1);	
			}				
		System.out.println("Ket qua con so thu nam "+a4);
		a5=n+r.nextInt(m-n+1);			
			while(a4==a||a4==a1||a4==a2||a4==a3)
			{				
			a5=n+r.nextInt(m-n+1);	
			}							
		System.out.println("Ket qua con so thu sau "+a5);
		
		int trung =0;
		if(s1==a1)
		{
			trung++;
			a1=0;
			
		}
		if(s1==a2)
		{
			trung++;
			a2=0;
			
		}
		if(s1==a3)
		{
			trung++;
			a3=0;			
		}
		if(s1==a4)
		{
			trung++;
			a4=0;
					}
		if(s1==a5)
		{
			trung++;
			a5=0;
			
		}
		if(s1==a)
		{
			trung++;
			a=0;			
		}
		if(s2==a1)
		{
			trung++;
			a1=0;
			
		}
		if(s2==a2)
		{
			trung++;
			a2=0;
			
		}
		if(s2==a3)
		{
			trung++;
			a3=0;			
		}
		if(s2==a4)
		{
			trung++;
			a4=0;
					}
		if(s2==a5)
		{
			trung++;
			a5=0;
			
		}
		if(s2==a)
		{
			trung++;
			a=0;			
		}
		if(s3==a1)
		{
			trung++;
			a1=0;
			
		}
		if(s3==a2)
		{
			trung++;
			a2=0;
			
		}
		if(s3==a3)
		{
			trung++;
			a3=0;			
		}
		if(s3==a4)
		{
			trung++;
			a4=0;
					}
		if(s3==a5)
		{
			trung++;
			a5=0;
			
		}
		if(s3==a)
		{
			trung++;
			a=0;			
		}
		if(s4==a1)
		{
			trung++;
			a1=0;
			
		}
		if(s4==a2)
		{
			trung++;
			a2=0;
			
		}
		if(s4==a3)
		{
			trung++;
			a3=0;			
		}
		if(s4==a4)
		{
			trung++;
			a4=0;
					}
		if(s4==a5)
		{
			trung++;
			a5=0;
			
		}
		if(s4==a)
		{
			trung++;
			a=0;			
		}
		if(s5==a1)
		{
			trung++;
			a1=0;
			
		}
		if(s5==a2)
		{
			trung++;
			a2=0;
			
		}
		if(s5==a3)
		{
			trung++;
			a3=0;			
		}
		if(s5==a4)
		{
			trung++;
			a4=0;
		}
		if(s5==a5)
		{
			trung++;
			a5=0;
			
		}
		if(s5==a)
		{
			trung++;
			a=0;			
		}
		if(s6==a1)
		{
			trung++;
			a1=0;
			
		}
		if(s6==a2)
		{
			trung++;
			a2=0;
			
		}
		if(s6==a3)
		{
			trung++;
			a3=0;			
		}
		if(s6==a4)
		{
			trung++;
			a4=0;
					}
		if(s6==a5)
		{
			trung++;
			a5=0;
			
		}
		if(s6==a)
		{
			trung++;
			a=0;			
		}
		switch(trung)
		{
		case 1 : 
			{
				System.out.println("Ban trung 1 so ");			
		        System.out.println("Chuc ban may man lan sau");
		        break;
			}
		case 2 : 
		{
			System.out.println("Ban trung 2 so ");			
	        System.out.println("Chuc ban may man lan sau");
	        break;
		}
		case 3 : System.out.print("Ban trung giai ba");break;
		case 4 : System.out.print("Ban trung giai nhi");break;
		case 5 : System.out.print("Ban trung giai nhat");break;
		case 6 : System.out.print("Ban trung giai dac biet");break;
		default : System.out.print("Chuc ban may man lan sau");
		}
		
			
		}
	}

