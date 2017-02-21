package LUYENTAP;

import java.util.Scanner;

public class Fraction {
	 int ts,ms; 
	    Scanner input=new Scanner(System.in); 
	    public Fraction() //bo khoi tao
	    { 	    } 
	    public void InputData() //phuong thuc nhap
	    { 
	        System.out.print("Nhap tu so: "); 
	        this.ts=input.nextInt(); 
	        do 
	        { 
	        System.out.print("Nhap mau so: "); 
	        this.ms=input.nextInt(); 
	        }  
	        while (this.ms==0); 
	    } 
	    public void OutputData(String y) //phuong thuc xuat
	    { 
	        System.out.println(y+" " +this.ts+"/"+this.ms); 
	    } 
	    public int UCLN(int a,int b) //phuong thuc tinh ucln
	    { 
	        if ((a==0) || (b==0)) 
	            return a+b; 
	        while(a!=b) 
	        { 
	            if(a>b) 
	                a=a-b; 
	            else 
	                b=b-a; 
	        } 
	        return a; 
	    } 
	    public void ToiGian()  // phuong thuc rut gon
	    { 
	        int i=UCLN(ts,ms); 
	        this.ts = this.ts/i; 
	        this.ms = this.ms/i; 
	    } 
	    public void NghichDao() // phuong thuc nghich dao
	    { 
	        int tg=this.ts; 
	        this.ts = this.ms; 
	        this.ms = tg; 
	    } 
	    public Fraction Sum(Fraction f) //phuong thuc tinh tong
	    { 
	        Fraction ps=new Fraction(); 
	        ps.ts = ((this.ts*f.ms) + (this.ms*f.ts)); 
	        ps.ms = (this.ms*f.ms); 
	        ps.ToiGian(); 
	        return ps; 
	    } 
	    public Fraction Hieu(Fraction f) // phuong thuc tinh hieu
	    { 
	        Fraction ps=new Fraction(); 
	        ps.ts = (this.ts*f.ms) - (this.ms*f.ts); 
	        ps.ms = (this.ms*f.ms); 
	        return ps; 
	    } 
	    public Fraction Tich(Fraction f) //phuong thuc tinh tich
	    { 
	        Fraction ps=new Fraction(); 
	        ps.ts = this.ts*f.ts; 
	        ps.ms = this.ms*f.ms; 
	        ps.ToiGian(); 
	        return ps; 
	    } 
	    public Fraction Thuong(Fraction f) //phuong thuc tinh thuong
	    { 
	        Fraction ps=new Fraction(); 
	        ps.ts = this.ts*f.ms; 
	        ps.ms = this.ms*f.ts; 
	        ps.ToiGian(); 
	        return ps; 
	    } 
	    public static void main(String[] argv)     
	    { 
	        Fraction ps1=new Fraction(); 
	        Fraction ps2=new Fraction(); 
	        ps1.InputData(); 
	        ps2.InputData(); 
	        ps1.OutputData("Phan so 1 la: ");      
	        ps2.OutputData("Phan so 2 la: "); 
	        ps1.ToiGian(); 
	        ps1.OutputData("Phan so 1 sau khi toi gian la: "); 
	        ps2.ToiGian(); 
	        ps2.OutputData("Phan so 2 sau khi toi gian la: "); 
	        ps1.Sum(ps2).OutputData("Tong hai phan so la: "); 
	        ps1.Hieu(ps2).OutputData("Hieu hai phan so la: "); 
	        ps1.Tich(ps2).OutputData("Tich hai phan so la: "); 
	        ps1.Thuong(ps2).OutputData("Thuong hai phan so la:"); 
	    } 
}
