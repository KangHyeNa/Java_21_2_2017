package mega645;

import java.util.ArrayList;
import java.util.Random;

public class mang6songaunhienkhongtrung {

	
		public mang6songaunhienkhongtrung() {}
		
		public static ArrayList generate(int number){

		ArrayList tmp = new ArrayList();
		int count=0;
		int value;
		boolean flag;
		Random r=new Random();
		int n=1,m=45;			
		
		while(count<number) {

		flag = false;
		value=n+r.nextInt(m-n+1);	
		for(int i=0; i<tmp.size(); i++){

		if(((Integer)tmp.get(i)).intValue()==value)
			{
				flag = true;
				break;
			}
		}
		if(!flag)	{
					tmp.add(value);
					count++;
					}
			}
		return tmp;
		}
		public static void main(String[] args)
		{
				ArrayList arrInt = mang6songaunhienkhongtrung.generate(6);
				System.out.print(arrInt);		
				

	}

}
