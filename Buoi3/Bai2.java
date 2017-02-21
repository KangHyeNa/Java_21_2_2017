package Buoi3;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) throws IOException {
	Scanner sNhap = new Scanner(System.in);
	System.out.print("Ban co bao nhieu nguoi ban : ");
	PrintWriter inputFile = new PrintWriter("Names1.txt");
	int n = sNhap.nextInt();
	sNhap.nextLine();
	String []a=new String[n];
	for (int i=0;i<n;i++)
	{		    
			System.out.print("Nhap ten nguoi ban thu ["+i+"]:");
			a[i]=sNhap.nextLine(); 
	}
	System.out.println("Ten cua cac ban la: ");
		for (int i=0;i<n;i++)
		{ 
		  System.out.println(a[i]);		  		  }
		for (int i=0;i<n;i++)
		{ 
		  inputFile.println(a[i]); 
		}		
		System.out.println("Du lieu da duoc ghi vao file");
		 inputFile.close();
		}
		}

