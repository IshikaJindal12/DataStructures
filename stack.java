import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Stack st=new Stack();
        st.push(2);
        st.push(4);
        st.push(6);
        st.push(8);
        st.push(10);
        System.out.println("peek element: "+st.peek());
        System.out.println("Element after popping: "+st.pop());
    }
}
class Stack{
    int max=100,top;
    int[] a=new int[max];
    Stack(){
        top=-1;
    }
    int push(int ele){
        if(top==max-1)
        {
            System.out.println("Overflow");
            return 0;
        }
        else{
            top++;
            a[top]=ele;
            return a[top];
        }
    }
    int pop(){
        if(top==-1){
            System.out.println("underflow");
            return 0;
        }
        else{
            top--;
            int z=a[top];
            return z;
        }
    }
    int peek(){
        if(top==-1){
            System.out.println("underflow");
            return 0;
        }
        else{
            int z=a[top];
            return z;
        }
    }
}
