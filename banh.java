abstract class nguyenlieu{
String Tennguyenlieu;
double tongkhoiluong;
abstract double tongluongchatbeo();
abstract double tongluongduong();
double dodamdac;}
class nguyenlieunguyenchat extends nguyenlieu
{
	double tongluongchatbeo;
	double tongluongduong;
    double khoiluong;
    double hamluongbeo;
    double hamluongduong;
    double dodamdac;
    double tongluongchatbeo()
    {
		tongluongchatbeo=hamluongbeo*khoiluong*dodamdac;
	    return 0;
    }
    double tongluongduong()
   {
	tongluongduong=hamluongduong*khoiluong;
    return 0;
   }	
}
class nguyenlieuhonhop extends nguyenlieunguyenchat
    {
	 double tongluongchatbeo()
	    {
		 if(khoiluong>50)
			tongluongchatbeo=hamluongbeo*khoiluong*dodamdac;
		    return 0;
	    }
	    double tongluongduong()
	   {
	    	if(dodamdac>60)
		tongluongduong=hamluongduong*khoiluong;
	    return 0;
	   }	
	    double dodamdac()
	    {
	    	dodamdac=(khoiluong*dodamdac)/khoiluong;
	    	return 0;
	    }
    
    }
    
public class banh 
    {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
