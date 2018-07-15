package gp;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int i, j;
		int array[] = { 8, 5, 1, 2, 5, 8, 7, 9, 7 };
		int NewLength = 1;
		for(int a: array)
		System.out.print(a+" ");
		for (i = 1; i < array.length; i++) {

			for (j = 0; j < NewLength; j++) {
				if (array[i] == array[j])
					break;
			}
			if (j == NewLength) {
				//System.out.println("NewLength :" + NewLength);
				array[NewLength++] = array[i];
			}
		}
		System.out.println();
        System.out.println("After Removing duplicate");
		for (int k = 0; k < NewLength; k++) {
			System.out.print(array[k] + " ");
		}
	}

}
