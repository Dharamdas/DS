package gp;

public class Fibonacii {

	int a=0,b=1,c=0;
	public static void main(String[] args) {
		Fibonacii fibo = new Fibonacii();
		System.out.print(fibo.b+" ");
		fibo.fibo(5);
	}
	
	public void fibo(int n)
	{
		if(n==0)
			return;
		
		this.c=this.a+this.b;
		this.a=this.b;
		this.b=this.c;
		System.out.print(this.c+" ");
		fibo(n-1);
	}

}
