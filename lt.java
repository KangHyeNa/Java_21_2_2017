import java.util.Scanner;

public class lt {

	public static void main(String[] args) {
		int sothuN=0;
		int f0=1;
		int f1=1;
		System.out.print("Nhap so tu nhien n:");
		Scanner sNhap = new Scanner(System.in);
		int n =sNhap.nextInt();
		if(n<0)
			{
		System.out.print("Nhap lai n:");
		n =sNhap.nextInt();
		}
		if(n>1)
		{
		
			for(int i=2;i<n;i++)
		{
		sothuN=f0+f1;
		f0=f1;
		f1=sothuN;
		}
			}
		System.out.print("so fibonacci thu "+n+" gt "+sothuN);
	}

}
