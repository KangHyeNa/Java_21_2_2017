package mega645;

import java.util.Random;
import java.util.Scanner;

public class mega645 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	     Scanner sNhap =new Scanner(System.in);
	     System.out.println("Chon con so dau tien");
	     int s1=sNhap.nextInt();
	     System.out.println("Chon con so thu hai");
	     int s2=sNhap.nextInt();
	     System.out.println("Chon con so thu ba");
	     int s3=sNhap.nextInt();
	     System.out.println("Chon con so thu tu");
	     int s4=sNhap.nextInt();
	     System.out.println("Chon con so thu nam");
	     int s5=sNhap.nextInt();
	     System.out.println("Chon con so thu sau");
	     int s6=sNhap.nextInt();
	     
	     
		Random r=new Random();
		System.out.println("Chon con so dau tien");					
		int conso=r.nextInt(5);
		System.out.println(conso);
		
		System.out.println("Chon con so thu hai");
		int conso2=r.nextInt(5);
		System.out.println(conso2);
				
		System.out.println("Chon con so thu ba");
		int conso3=r.nextInt(5);
		System.out.println(conso3);
		
		System.out.println("Chon con so thu tu");	
		int conso4=r.nextInt(5);
		System.out.println(conso4);
		
		System.out.println("Chon con so thu nam");	
		int conso5=r.nextInt(5);
		System.out.println(conso5);
		
		System.out.println("Chon con so thu sau");	
		int conso6=r.nextInt(5);
		System.out.println(conso6);
		
		System.out.println("QUAY SO MEGA 645");
		int a1 =0;;
		switch(conso)
		{				
		case 0:
			{
			int n=1,m=9;			
			a1=n+r.nextInt(m-n);	
			System.out.println("Ket qua con so thu nhat " +"0"+a1);				
			break;
			}
		case 1:
		{
		int n=10,m=19;			
		a1=n+r.nextInt(m-n);	
		System.out.println("Ket qua con so thu nhat " +a1);		
		break;
		}
		case 2:
		{
		int n=20,m=29;			
		a1=n+r.nextInt(m-n);	
		System.out.println("Ket qua con so thu nhat " +a1);		
		break;
		}
		case 3:
		{
		int n=30,m=39;			
		a1=n+r.nextInt(m-n);	
		System.out.println("Ket qua con so thu nhat " +a1);		
		break;
		}
		case 4:
		{
		int n=40,m=45;			
		a1=n+r.nextInt(m-n);	
		System.out.println("Ket qua con so thu nhat  " +a1);		
		break;		
		}		
		}
		int a2 =0;
		switch(conso2)
		{				
		case 0:
			{
			int n=1,m=9;			
			a2=n+r.nextInt(m-n);	
			System.out.println("Ket qua con so thu hai " +"0"+a2);			
			break;
			}
		case 1:
		{
		int n=10,m=19;			
		a2=n+r.nextInt(m-n);	
		System.out.println("Ket qua con so thu hai " +a2);		
		break;
		}
		case 2:
		{
		int n=20,m=29;			
	    a2=n+r.nextInt(m-n);	
		System.out.println("Ket qua con so thu hai " +a2);		
		break;
		}
		case 3:
		{
		int n=30,m=39;			
		a2=n+r.nextInt(m-n);	
		System.out.println("Ket qua con so thu hai " +a2);		
		break;
		}
		case 4:
		{
		int n=40,m=45;			
		a2=n+r.nextInt(m-n);	
		System.out.println("Ket qua con so thu hai " +a2);		
		break;		
		}		
		}	
		int a3 =0;
		switch(conso3)
		{
		
		case 0:
			{
			int n=1,m=9;			
			a3=n+r.nextInt(m-n);	
			System.out.println("Ket qua con so thu ba " +"0"+a3);			
			break;
			}
		case 1:
		{
		int n=10,m=19;			
		a3=n+r.nextInt(m-n);	
		System.out.println("Ket qua con so thu ba " +a3);			
		break;
		}
		case 2:
		{
		int n=20,m=29;			
		a3=n+r.nextInt(m-n);	
		System.out.println("Ket qua con so thu ba " +a3);			
		break;
		}
		case 3:
		{
		int n=30,m=39;			
		a3=n+r.nextInt(m-n);	
		System.out.println("Ket qua con so thu ba " +a3);		
		break;
		}
		case 4:
		{
		int n=40,m=45;			
		a3=n+r.nextInt(m-n);	
		System.out.println("Ket qua con so thu ba " +a3);			
		break;		
		}				
		}
		int a4=0;
		switch(conso4)
		{				
		case 0:
			{
			int n=1,m=9;			
			a4=n+r.nextInt(m-n);	
			System.out.println("Ket qua con so thu tu " +"0"+a4);			
			break;
			}
		case 1:
		{
		int n=10,m=19;			
		a4=n+r.nextInt(m-n);	
		System.out.println("Ket qua con so thu tu " +a4);		
		break;
		}
		case 2:
		{
		int n=20,m=29;			
		a4=n+r.nextInt(m-n);	
		System.out.println("Ket qua con so thu tu " +a4);			
		break;
		}
		case 3:
		{
		int n=30,m=39;			
		a4=n+r.nextInt(m-n);	
		System.out.println("Ket qua con so thu tu " +a4);			
		break;
		}
		case 4:
		{
		int n=40,m=45;			
		a4=n+r.nextInt(m-n);	
		System.out.println("Ket qua con so thu tu " +a4);		
		break;	
		}		
		}
		int a5=0;
		switch(conso5)
		{				
		case 0:
			{
			int n=1,m=9;			
			a5=n+r.nextInt(m-n);	
			System.out.println("Ket qua con so thu nam " +"0"+a5);			
			break;
			}
		case 1:
		{
		int n=10,m=19;			
		a5=n+r.nextInt(m-n);	
		System.out.println("Ket qua con so thu nam " +a5);		
		break;
		}
		case 2:
		{
		int n=20,m=29;			
		a5=n+r.nextInt(m-n);	
		System.out.println("Ket qua con so thu nam " +a5);			
		break;
		}
		case 3:
		{
		int n=30,m=39;			
		a5=n+r.nextInt(m-n);	
		System.out.println("Ket qua con so thu nam " +a5);			
		break;
		}
		case 4:
		{
		int n=40,m=45;			
		a5=n+r.nextInt(m-n);	
		System.out.println("Ket qua con so thu nam " +a5);			
		break;		
		}		
		}
		int a6=0;
		switch(conso6)
		{				
		case 0:
			{
			int n=1,m=9;			
			a6=n+r.nextInt(m-n);	
			System.out.println("Ket qua con so thu sau " +"0"+a6);			
			break;
			}
		case 1:
		{
		int n=10,m=19;			
		a6=n+r.nextInt(m-n);	
		System.out.println("Ket qua con so thu sau " +a6);		
		break;
		}
		case 2:
		{
		int n=20,m=29;			
		a6=n+r.nextInt(m-n);	
		System.out.println("Ket qua con so thu sau " +a6);	
		break;
		}
		case 3:
		{
		int n=30,m=39;			
		a6=n+r.nextInt(m-n);	
		System.out.println("Ket qua con so thu sau " +a6);	
		break;
		}
		case 4:
		{
		int n=40,m=45;			
		a6=n+r.nextInt(m-n);	
		System.out.println("Ket qua con so thu sau " +a6);
		break;		
		}		
		}
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
		if(s1==a6)
		{
			trung++;
			a6=0;			
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
		if(s2==a6)
		{
			trung++;
			a6=0;			
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
		if(s3==a6)
		{
			trung++;
			a6=0;			
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
		if(s4==a6)
		{
			trung++;
			a6=0;			
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
		if(s5==a6)
		{
			trung++;
			a6=0;			
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
		if(s6==a6)
		{
			trung++;
			a6=0;			
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


