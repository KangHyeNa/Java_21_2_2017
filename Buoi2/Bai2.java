package Buoi2;

import java.util.Random;
import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		Scanner sNhap=new Scanner(System.in);
		sNhap = new Scanner(System.in);
		System.out.print("Nhap vao so phan tu n : ");
		int n = sNhap.nextInt();
		int a[]=new int [n];
		Random r=new Random(23);
		for(int i=0;i<n;i++)
			a[i]=r.nextInt();
		for (int i=0;i<n;i++)
			System.out.print("\t"+a[i]);

	}

}
