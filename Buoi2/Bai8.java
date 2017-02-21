package Buoi2;

import java.util.Scanner;

public class Bai8 {

	public static void main(String[] args) {
		Scanner sNhap = new Scanner(System.in);
		System.out.print("Nhap chuoi: ");
		String chuoi = sNhap.nextLine();
		System.out.println("Chuoi vua nhap la : "+ chuoi );
		System.out.print("Chuoi in nguoc la : ");
		for (int i =chuoi.length()-1;i>=0;i--)
			System.out.print(chuoi.charAt(i));
	}

}
