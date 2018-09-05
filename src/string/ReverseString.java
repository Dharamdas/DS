package string;

public class ReverseString {

	public static void main(String[] args) {

		String str="dharamdaskushwaha";

			System.out.print("Reversed String --> "+reverse(str));
	}

	public static String reverse(String str){
		char arr[] = str.toCharArray();
		//System.out.println("Length: "+arr.length/2);
		for(int i=0;i<arr.length/2;i++)
		{
			char t = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i]=t;
		}
		return String.valueOf(arr);
	}

}
