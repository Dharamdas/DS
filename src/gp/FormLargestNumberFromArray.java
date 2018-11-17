package gp;

import java.util.Arrays;
import java.util.Comparator;

public class FormLargestNumberFromArray {

    public static void main(String[] args) {

        int []arr = {3,9,45,92,43};  //99245433
        System.out.println(largestNumber(arr));
    }

    public static  String largestNumber(int[] nums) {

        // Get input integers as strings.
        String[] asStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            asStrs[i] = String.valueOf(nums[i]);
        }
        System.out.println("Before Sorting String: "+Arrays.toString(asStrs));
        // Sort strings according to custom comparator.
        Arrays.sort(asStrs, new LargerNumberComparator());

        System.out.println("After Sorting String: "+Arrays.toString(asStrs));
        // If, after being sorted, the largest number is `0`, the entire number
        // is zero.
        if (asStrs[0].equals("0")) {
            return "0";
        }

        // Build largest number from sorted array.
        String largestNumberStr = new String();
        for (String numAsStr : asStrs) {
            largestNumberStr += numAsStr;
        }

        return largestNumberStr;
    }

    private static class LargerNumberComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            String order1 = a + b;
            System.out.println("order1: "+order1);
            String order2 = b + a;
            System.out.println("order2: "+order2);
            return order2.compareTo(order1);
        }
    }
}
