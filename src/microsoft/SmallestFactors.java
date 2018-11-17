package microsoft;

import java.util.ArrayList;
import java.util.List;

public class SmallestFactors {

    public static void main(String[] args) {

        smallet(36);
    }

    static void smallet(int n) {
       for (int i = n + 1; i <= 2 * n; i++) {
           int result = 1;
           int t = i;
           while (t >= 0) {
               result = result * (t % 10);
               t = t / 10;
           }
           if (result == n) {
               System.out.println(i);
               break;
           }
       }
   }

}
