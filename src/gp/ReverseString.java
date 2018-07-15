package gp;

public class ReverseString {

	public static void main(String[] args) {

		String str="aamdeus";
		char arr[] = str.toCharArray();
		System.out.println("Length: "+arr.length/2);
		for(int i=0;i<arr.length/2;i++)
		{
			char t = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i]=t;
		}
		for(char t:arr)
			System.out.print(t);
	}

}
