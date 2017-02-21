package Buoi2;

public class Bai9 {

	public static void main(String[] args) {
		String str1="abc";
		String str2="dcd";
		System.out.println(" "+str1.compareTo(str2));
		System.out.println(" "+str2.compareTo(str1));
		System.out.print(" "+str1.compareTo(str1));
		boolean e1 = (str1 == str2); // false
		System.out.println("\n"+e1);

	}

}
