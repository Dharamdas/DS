package stack;

import java.util.Stack;

public class RemoveMiddleElementFromStack {
    public static void main(String[] args) {

        Stack<Character> st =
                new Stack<Character>();

        // push elements into the stack
        st.push('1');
        st.push('2');
        st.push('3');
        st.push('4');
        st.push('5');
        st.push('6');
        st.push('7');
        System.out.println("Printing Stack before Deletion of Middle Element: "+st.toString());
        deleteMid(st, st.size(), 0);
        System.out.println("Printing Stack after Deletion of Middle Element: "+st.toString());

    }

    // Deletes middle of stack of size
    // n. Curr is current item number
    static void deleteMid(Stack<Character> st,
                          int n, int curr)
    {
        // If stack is empty or all items
        // are traversed
        if(st.empty() && curr==n)
        {
            return;
        }
        //remove current item
        char x = st.pop();

        // Remove other items
        deleteMid(st, n, curr+1);

        // Put all items back except middle
        if (curr != n/2)
            st.push(x);
    }


}
