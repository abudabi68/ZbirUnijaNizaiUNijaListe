package cetvrto.poglavlje;

public class Tacka {

	public static void main(String[] args) {
		Klasa k1=new Klasa();
        double x=8;
        double y=4;
        double r=0;
       System.out.println( k1.rastojanje(r,x,y));
       /*
        * Zbir elemenata dva niza 
        */
       double a[]={2,4,25,36,63,84};
       double b[]={1,5,8,45,33,25};
       double c[]=new double [a.length];
       double d[]=new double [a.length];
       for(int i=0,j=0;i<a.length ;i++){
    	   c[i]=a[i]+b[i];
    	  
       }
       System.out.println("Zbir");
       for(int j=0;j<c.length;j++){
    	   System.out.println(c[j]);
    	   
       }
       
	}

 
}
