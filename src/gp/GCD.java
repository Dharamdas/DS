package gp;

public class GCD {
	public static void main(String[] args) {
		System.out.println("GCD Of 20,32 is: "+ GCD.findGCD(20, 32));
		System.out.println("GCD of 20,32 "+ GCD.gcd(20, 32));
		
	}

	//recursive
	public static int gcd(int a, int b)
	{
	    if (a == 0)
	        return b;
	    return gcd(b%a, a);
	}
	
	public static int findGCD(int a,int b)
	{
		int r=0;
		//find the greater no 
		int greater = a>b?a:b;
		//find smaller number
		int smaller=a<b?a:b;
		
		r=smaller;
		while(greater%smaller!=0)
		{
			r = greater%smaller;
			greater = smaller;
			smaller = r;
		}
		return r;
	}
}
