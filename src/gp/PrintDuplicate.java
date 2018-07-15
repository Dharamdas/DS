package gp;

public class PrintDuplicate {

	public static void main(String[] args) {

		int[] a = new int[] { 10, 20, 30, 40, 10, 20, 50, 70, 1000, 50 };
		//PrintDuplicate.printDuplicate(a);
		PrintDuplicate.printDuplicate1(a);
	}
	
	//using count array
	public static void printDuplicate1(int []a){
		int count[] = new int[a.length-2];
		for(int i=0;i<a.length;i++)
		{
			count[a[i]]++;
			if(count[a[i]]==2)
				System.out.println(a[i]+" ");
		}
	}
	
	public  static void printDuplicate(int []a){
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					System.out.println(a[i]);

				} else {

					continue;
				}

			}

		}

	}

}