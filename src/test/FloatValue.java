package test;

import java.util.Comparator;

public class FloatValue {
    public static void main(String[] args) {
        Float f1 = new Float("3.0");
        int x=f1.intValue();
        byte b = f1.byteValue();
        double d = f1.doubleValue();
        System.out.println(x+b+d);

        String[] cities = {"Bangalroe","Pune","San Fracisco", "New York City"};

        byte a[]={65,66,67,68,69,70};
        byte aa[]={71,72,73,74,75,76};

        System.arraycopy(a,2,aa,1,a.length-3);
        System.out.println(new String(a)+" "+new String(aa));
    }

    static class MySort implements Comparator<String>{

        @Override
        public int compare(String a, String b) {
            return b.compareTo(a);
        }
    }
 /*
            5 3
            2 8 5 1 10
            4 5 9
            3 5 6
            1 2 8

            1
            1
            0

*/
}
