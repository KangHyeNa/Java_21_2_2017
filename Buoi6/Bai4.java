package Buoi6;
abstract class Father 
{
	abstract void M1();
	abstract void M2();
}
abstract class Son extends Father
{
	void M1()
	{
		System.out.println("Son M1");
	}
	
}
class Nephew extends Son
{
	void M2()
	{
		System.out.println("Nephew M2");
	}
	
}
public class Bai4 {

	public static void main(String[] args) {
		Father obj = new Nephew();
		obj.M1();
		obj.M2();
	}

}
