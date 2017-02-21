package LUYENTAP;

import java.util.Scanner;

public class nhapmangps {
	public nhapmangps(){}
	 private int tu;
	    private int mau;
	    public nhapmangps(int tu,int mau){
	        this.tu=tu;
	        this.mau=mau;
	    }
	    public  nhapmangps cong(nhapmangps p){
	        int tu=this.tu*p.mau+p.tu*this.mau;
	        int mau=this.mau*p.mau;
	        return new nhapmangps(tu,mau);
	    }
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("nhap so pt: ");
	        int a=sc.nextInt();
	        nhapmangps[] ps =new nhapmangps[a];
	        for(int i=0;i<ps.length;i++)
	            {
	        	ps[i] = new nhapmangps ();
	        	System.out.println("nhap ps thu "+i+": ");
	                System.out.println("nhap ts: ");
	                ps[i].tu=sc.nextInt();
	                System.out.println("nhap ms: ");
	                ps[i].mau=sc.nextInt();

	            }
	       for(int i=0;i<ps.length;i++)
	            System.out.println("Phan so thu "+i+"\n "+ps[i].tu+"/"+ps[i].mau);

	    }
}
