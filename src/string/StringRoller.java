package string;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StringRoller {

    public static void main(String[] args) {
        String s = "geeks";
        int k[] = {1, 2, 5};
        System.out.println(roll(s,k));
    }

    public static String roll(String toRoll, int roll[]) {

        int toRollLength = toRoll.length();
        int rollCounts[] = new int[toRollLength];

        Arrays.stream(roll).forEach(rollCount -> rollCounts[rollCount - 1]++);

        for (int index = toRollLength - 2; index >= 0; index--)
        {
            rollCounts[index] += rollCounts[index + 1];
        }

        char toRollArray[] = toRoll.toCharArray();
        IntStream.range(0, toRollLength).forEach(index -> {
            toRollArray[index] = (char) ('a' + (rollCounts[index] % 26 + toRollArray[index] - 'a') % 26);
        });

        return String.valueOf(toRollArray);


    }

}
