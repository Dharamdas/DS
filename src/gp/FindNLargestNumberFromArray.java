package gp;

import java.util.HashMap;
import java.util.Map;

public class FindNLargestNumberFromArray {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 3, 4, 2,1,2};
		int n = arr.length;
		int k = 3;
		System.out.println("Count of pairs with given diff is "
				+ SumPairs(arr, k));

	}


	public static int SumPairs(int[] input, int k) {

		Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
		int tmp = 0;
		for (int data : input) {
			if (pairs.containsKey(k - data) && pairs.get(k - data) == 0) {
				tmp++;
				pairs.put((k - data), pairs.get(k - data) + 1);
			} else if (!pairs.containsKey(data)) {
				pairs.put(data, 0);
			}
		}

		return tmp;
	}


}
