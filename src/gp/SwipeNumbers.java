package gp;

public class SwipeNumbers {

	public static void main(String[] args) {

		int a=10,b=20;
		System.out.println("Before Swipe: "+"A= "+a+" , B= "+b);
		a = a+b; //30
		b = a-b; // 30-20 = 10
		a = a-b; //30-10 = 20
		System.out.println("After Swipe: "+"A= "+a+" , B= "+b);
		
		
	}

}
