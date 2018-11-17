package gp;

import java.util.LinkedList;
import java.util.List;

public class FindSubListFromMainList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        List<Integer> sublist = new LinkedList<Integer>();
        sublist.add(3);
        sublist.add(4);
        sublist.add(5);
        System.out.println(isSubList(list,sublist));
    }



    public static int isSubList(List<Integer> list,List<Integer> sublist) {
        boolean contains = true;
        int currIndex = 0;
        int i = 0, j = 0;

        for (; j < sublist.size(); j++) {
            int e2 = sublist.get(j);
            for (i = currIndex; i < list.size(); i++) {
                if (e2 == list.get(i)) {
                    break;
                }
            }
            if (i == list.size()) {
                contains = false;
                break;
            }
            currIndex++;
            if (contains && (currIndex == sublist.size())) {
                return  (i - j);
            }
        }
        return -1;
    }




    /*
    Implement a method find that given two lists will find the starting index (indexing is zero based) where the second list occurs as a sub-list in the first list. Your implementation should return -1 if the sub-list cannot be found. Arguments are always defined, non-empty lists.


Sample Input 1

list1 = (1, 2, 3)
list2 = (2, 3)

Sample Output 1
1

Explanation

As second list (2, 3) is sub-list in first list (1, 2, 3) at index 1


Sample Input 2

list1 = (1, 2, 3)
list2 = (3, 2)

Sample Output 2
-1

Explanation

As second list is not there in the first list so the output is -1
     */
}

