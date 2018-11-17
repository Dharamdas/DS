package test;

import java.util.Arrays;
import java.util.Comparator;

public class VLA2 implements Comparator<VLA2> {
int dishsize;




VLA2(int d){
dishsize=d;
}
    @Override
    public int compare(VLA2 o1, VLA2 o2) {
        return o2.dishsize-o1.dishsize;
    }


    public static void main(String[] args) {
        VLA2[] va = {new VLA2(40),new VLA2(200),new VLA2(60)};
        Arrays.sort(va,va[0]);

        int index = Arrays.binarySearch(va, new VLA2(40),va[0]);
        System.out.println(index+" ");
         index = Arrays.binarySearch(va, new VLA2(80),va[0]);
        System.out.println(index);

    }
}
