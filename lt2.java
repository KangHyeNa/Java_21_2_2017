import java.util.Scanner;

public class lt2 {

	
		public static int nhapn()
		{
			System.out.print("Nhap so tu nhien n: ");
			Scanner sNhap = new Scanner(System.in);
			int n=sNhap.nextInt();
			if(n<0)
			System.out.print("Nhap lai so tu nhien n: ");					
			return n;
		}
	
public static void main(String[] args) {
	
}
}