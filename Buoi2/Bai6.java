package Buoi2;

import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		Scanner sNhap= new Scanner(System.in);
		sNhap = new Scanner(System.in);
		System.out.print("Nhap vao so phan tu n : ");
		int n = sNhap.nextInt();
		int [] a=new int [n];
		for (int i=0;i<n;i++)
		{
		  System.out.print("Nhap phan tu thu a["+i+"]:");
		  a[i]=sNhap.nextInt();
		  }
		for(int i=0; i<a.length; i++)
		{ 
		for(int j=0; j<=i; j++)
		{
		if(a[i]<=a[j])
		{ 
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		}
		}
		} 
		System.out.println("Mang sau khi sap xep tang dan:");
		for(int i=0; i<a.length; i++)
		{ 
		System.out.print(a[i]+"\t");
		}

	}

}
