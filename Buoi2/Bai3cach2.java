package Buoi2;

import java.util.Scanner;

public class Bai3cach2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sNhap=new Scanner(System.in);
		System.out.print("Nhap vao so x : ");
        int x = sNhap.nextInt();
		System.out.print("Nhap vao so y : ");
        int y =sNhap.nextInt();
        int number;
        number= x>y?x:y;
        System.out.print("So lon nhat la: "+number);
	}

}
