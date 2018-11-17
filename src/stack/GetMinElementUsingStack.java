package stack;

import designquestion.servicelocator.InitialContext;

import java.util.Stack;

public class GetMinElementUsingStack {

    Stack<Integer> s;
    Integer minEle;

    GetMinElementUsingStack(){
        s = new Stack<>();
    }


    public static void main(String[] args) {
        GetMinElementUsingStack s = new GetMinElementUsingStack();
        s.push(3);
        s.push(5);
        s.getMin();
        s.push(2);
        s.getMin();
        s.pop();


    }


    public int getMin() {
        if(s.empty())
        {
            System.out.println("Stack is Empty ");
            return -1;
        }
        else{
            System.out.println("Min Value of Stack is: "+minEle);
            return minEle;
        }

    }

    // prints top element of MyStack
    void peek()
    {
        if(s.empty())
        {
            System.out.println("Stack is Empty");
            return;
        }
        Integer temp = s.peek();

        if(temp<minEle)
            System.out.println("MinStack: "+temp);
        else
            System.out.println("Min Value of Stack is: "+minEle);
    }

    public void push(Integer newelement){
        if(s.empty())
        {
            s.push(newelement);
            minEle=newelement;
            System.out.println("Inserted Element: "+newelement +" Min Element: "+minEle);
            return;
        }else{

            if(newelement<minEle)
            {
                int tmp = 2*newelement-minEle;
                s.push(tmp);
                minEle=newelement;
                System.out.println("Inserted Element: "+tmp +" Min Element: "+minEle);
            }else{
                s.push(newelement);
                System.out.println("Inserted Element: "+newelement +" Min Element: "+minEle);
            }
        }

    }

    public Integer pop(){

        if(s.empty())
        {
            System.out.println("Stack is Empty");
            return null;
        }
        int tmp = s.pop();
        int t=0;
        if(tmp<minEle)
        {
            t=minEle;
            minEle = 2*minEle-tmp;
            return t;
        }
        System.out.println("Top Most Element is Removed: "+tmp);
        return tmp;
    }



}
