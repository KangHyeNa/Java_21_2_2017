package Buoi2;

import java.util.Scanner;

public class bai7 {

	public static void main(String[] args) {
		Scanner	sNhap = new Scanner(System.in);
		System.out.print("Nhap vao so phan tu n : ");
		int n = sNhap.nextInt();
		int [] a=new int [n];
		for (int i=0;i<n;i++)
		{
		  System.out.print("Nhap phan tu thu a["+i+"]:");
		  a[i]=sNhap.nextInt();
		  }
		int s=0;
		for(int i=0; i<a.length; i++)
		{ 
			if((a[i])%2!=0)
			s+=a[i];
		}
		System.out.print("Tong cac phan tu le la: "+ s);
	}

}
