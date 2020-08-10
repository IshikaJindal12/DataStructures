public class Stack
{
public static void main(String args[])
    {
        Stack st=new Stack();
        
        st.push1(20);
        st.push2(40);
        st.push1(60);
        st.push1(80);
        st.push2(100);
        
        System.out.println("Element popped out: ",st.pop1());
        System.out.println("Element popped out: ",st.pop2());
    }
    int s=10;
    int a[]=new int[s];
    int top1=-1;
    int top2=s;
    
    void push1(int ele)
    {
        if(top1<top2-1)
        {
        top1=top1+1;
            a[top1]=ele;
        }
        else
        {
            System.out.println("Stack Overflow");
        }
    }
    
    void push2(int ele)
    {
        if(top1<top2-1)
        {
        top2=top2-1;
            a[top2]=ele;
        }
        else
        {
            System.out.println("Stack Overflow");
        }
    }
    
    int pop1()
    {
        if(top1>=0)
        {
            int ele=a[top1];
            top1--;
            return ele;
        }
        else
        {
            System.out.println("Stack Underflow");
            return 0;
        }
    }
    
    int pop2()
    {
        if(top2<s)
        {
            int ele=a[top2];
            top2++;
            return ele;
        }
        else
        {
            System.out.println("Stack Underflow");
            return 0;
        }
    }
}
