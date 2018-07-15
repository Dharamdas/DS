package gp;

public class StringPallenDrom {
	
	public static void main(String[] args) {
		
		String str="rama";
		boolean flag=true;
		for(int i=0;i<str.length()/2;i++)
		{
			if(!(str.charAt(i)==str.charAt(str.length()-1-i)))
			{
				flag=false;
			}
		}
		if(flag)
		{
			System.out.println("String is pallendrom");
		}else{
			System.out.println("String is not pallendrom");
		}
	}

}
