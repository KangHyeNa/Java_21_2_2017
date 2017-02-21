package Buoi3;

import java.io.IOException;
import java.io.PrintWriter;

public class Bai1cach2 {

	public static void main(String[] args) throws IOException
	{
		PrintWriter inputFile = new PrintWriter("D:\\Names.txt");
		inputFile.println("Chris");
		inputFile.println("Kathryn");
		inputFile.println("Joan");
		inputFile.close();
		System.out.println("Du lieu da duoc ghi vao file");
	}
		
	}


