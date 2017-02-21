package Buoi2;

import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		Scanner sNhap = new Scanner(System.in);
		sNhap = new Scanner(System.in);
		System.out.print("Nhap vao so phan tu n : ");
		int n = sNhap.nextInt();
		int [] a=new int [n];
		for (int i=0;i<n;i++)
		{
		  System.out.print("Nhap phan tu thu a["+i+"]:");
		  a[i]=sNhap.nextInt();}
		int max = a[0];
        int min = a[0];
        for (int i=0;i<n;i++)
        {
            if(max<a[i])
                max=a[i];
            if(min>a[i])
             min=a[i];
		}
        System.out.println("Phan tu lon nhat la : " +max);
        System.out.println("Phan tu nho nhat la : " +min);
	}

}
