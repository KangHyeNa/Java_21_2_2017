package LUYENTAP;

import java.util.Scanner;

public class fibonacci2 {
	public static int F(int n) {
	    if (n == 0 || n == 1) return 1;
	    else return F(n - 1) + F(n - 2);
	}
	 
	/*Chuong trinh chinh*/
	public static void main(String[] args) {
	  	    int n;
	    System.out.print("Nhap vao gia tri cua n = ");
	   Scanner sNhap = new Scanner(System.in);
	   n=sNhap.nextInt();
	   System.out.print("F("+ n +") = "+ F(n));
	   
	}
}
