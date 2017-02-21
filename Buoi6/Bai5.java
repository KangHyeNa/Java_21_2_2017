package Buoi6;

abstract class father1 
{
	abstract void M1();
	abstract void M2();
}

abstract class Son1 extends father1
{

}
class Nephew1 extends Son1{
void M1(){
	System.out.println("Son M1");
}
void M2(){
	System.out.println("Nephew M2");
}
}
public class Bai5 {

	public static void main(String[] args) {
		father1 obj1 =new Nephew1();
		obj1.M1();
		obj1.M2();

	}

}
