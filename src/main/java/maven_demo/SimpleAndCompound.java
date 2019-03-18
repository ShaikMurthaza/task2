package maven_demo;

public class SimpleAndCompound {

	public int  simple(int p,int t,int r)
	{  System.out.format("%d",(p*t*r)/100);
		return((p*t*r)/100);
	}
	public double  Compound(double p,double t,double r)
	{
	  double re1= 1+(r/100);
	  double re2=Math.pow(re1,t);
	  return(p*re2);
	}
}
