package LUYENTAP;

import java.util.Arrays;
import java.util.Scanner;

public class mang1chieu {
	
		
		public static void main(String[] args) {
		
		int arrInt[];
		int n;
		Scanner input =new Scanner(System.in);
		System.out.println("nhap so phan tu n=: ");
		n=input.nextInt();
		arrInt = new int[n];
		for (int i = 0; i < n; i++) {
		System.out.println("nhap a[" +i+"] =");
		arrInt[i]=input.nextInt();
		}
		for (int i = 0; i < n; i++) {
		System.out.print(arrInt[i]+" ");
		}
		int min=arrInt[0];
		int max=arrInt[0];
		for (int i = 0; i < n; i++) {
		if (arrInt[i]<min) {
		min=arrInt[i];
		}
		if (arrInt[i]>max) {
		max=arrInt[i];
		}
		}
		System.out.println("\ngia tri nho nhat: "+min);
		System.out.println("\ngia tri lon nhat: "+max);
		int dem=0;
		for (int i = 0; i < n; i++) {
		if (arrInt[i]%2==0) {
		dem++;
		}
		}
		System.out.println("\n"+ "so phan tu chan la: "+dem);
		
		}
		
		
		}

