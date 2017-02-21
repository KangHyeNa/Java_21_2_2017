package Buoi3;

import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		Scanner sNhap = new Scanner(System.in);
		System.out.print("Nhap so dong: "); 
		int dong=sNhap.nextInt();  
	    System.out.print("Nhap so cot: ");
	    int cot=sNhap.nextInt();  
	    int [][] a=new int [dong][cot];
	    int i,j;
	    for(i=0; i<dong; i++)  
	    {
	        for(j=0;j<cot; j++)
				{
		  System.out.print("Nhap phan tu thu a["+i+"]: "+"a["+j+"]:");
		  a[i][j]=sNhap.nextInt();
		  }
	        }
	    
	    for(i=0; i<dong; i++)  
	    {  
	      for(j=0;j<cot; j++)  
	        System.out.print("\t"+a[i][j]);  
	      System.out.print("\n");  
	    }  
	      
	    }
	}

	


