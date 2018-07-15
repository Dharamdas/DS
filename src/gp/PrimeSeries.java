package gp;

public class PrimeSeries {

	public static void main(String[] args) {
		System.out.println("PrimeSeries: ");
		perimeSeries(10);
		System.out.println();
		System.out.println("11 -- "+isPrimeNumber(11));
		System.out.println("6 -- "+isPrimeNumber(6));
		System.out.println("13 -- "+isPrimeNumber(13));
	}
	
	public static void perimeSeries(int n)
	{
		for(int i=1;i<=n;i++)
		{
			printSeries(i);
		}
	}

	public static void printSeries(int i)
	{
		int count=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
				count++;
		}
		if(count==2)
			System.out.print(i+" ");
	}
	
  public static boolean isPrimeNumber(int number){
		System.out.println("Divided by 2: "+number/2);
		for(int i=2; i<=number/2; i++){
			if(number % i == 0){
				return false;
			}
		}
		return true;
	}
}
