package cetvrto.poglavlje;

public class Skup {
private double [] niz;

public Skup(double[] niz) {
	super();
	this.niz = new double [0];
}
public Skup(double b){
	 niz=new double [1];
	 b=niz[0];
 }
private void kopiraj(double a [], int n){
	niz=new double[n];
	for(int i=0;i<n;niz[i]=a[i++]);
}
private void unija(Skup s1 ,Skup s2){
	double a[]=new double [s1.niz.length+s2.niz.length];
	int n=0;
	for (int i=0,j=0; i<s1.niz.length || j<s2.niz.length;){
		a[n++]= i==s1.niz.length ? s2.niz[j++] :
			    j==s1.niz.length ? s2.niz[i++]:
			    s1.niz[i]<s2.niz[j] ? s1.niz[i++]:
			    s1.niz[i]>s2.niz[j] ? s2.niz[j++]:
			    	                  s1.niz[i++];
			    if(j<s2.niz.length && s2.niz[j]==a[n-1])
			    	j++;			    
	}
	kopiraj(a,n);
}
      
}
