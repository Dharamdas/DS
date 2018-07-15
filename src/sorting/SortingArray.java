package sorting;

public class SortingArray
{

	public static void main(String[] args)
	{
		int arr[] = { 0, 1, 2, 0, 1, 2, 0, 1, 2, 1, 1, 2 };
		int noOfElement[] = new int[3];
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == 0)
				noOfElement[0] = noOfElement[0] + 1;
			else if (arr[i] == 1)
				noOfElement[1] = noOfElement[1] + 1;
			else
				noOfElement[2] = noOfElement[2] + 1;
		}
		int noOfZero = noOfElement[0];
		int noOfOne =  noOfElement[1];
		int noOfTwo =  noOfElement[2];
		int count = 0;
		while(noOfZero > 0)
		{
			arr[count++]=0;
			noOfZero--;
		}
		while(noOfOne > 0)
		{
			arr[count++]=1;
			noOfOne--;
		}
		while(noOfTwo > 0)
		{
			arr[count++]=2;
			noOfTwo--;
		}
		for(int j=0;j<count;j++)
		{
			System.out.print(arr[j]);
		}
	}

}
