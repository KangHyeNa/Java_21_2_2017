package Buoi3;

import java.util.Random;
import java.util.Scanner;

public class Bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap=new Scanner(System.in);  
	    int a[][],i,j;  
	    System.out.print("Nhap so dong: "); int dong=nhap.nextInt();  
	    System.out.print("Nhap so cot: "); int cot=nhap.nextInt();  
	      
	    a=new int [dong][cot]; 
	    Random r =new Random();
	    for(i=0; i<dong; i++)  
	      for(j=0;j<cot; j++)  	        
	    a[i][j]=r.nextInt(50);  
	    for(i=0; i<dong; i++)  
	    {  
	      for(j=0;j<cot; j++)  
	        System.out.print("\t"+a[i][j]);  
	      System.out.print("\n");  
	    }  
	      
	  
	  }    
	}


