import java.util.*; 
  
public class Main
{ 
    public static int evalPostfix(String exp) 
    { 
        Stack<Integer> st = new Stack<>(); 
          
        for(int i=0; i < exp.length(); i++) 
        { 
            char ch = exp.charAt(i); 
             
            if(Character.isDigit(ch))
            st.push(ch -'0'); 
              
           
            else  
            { 
                int value1 = st.pop(); 
                int value2 = st.pop(); 
                  
                switch(ch) 
                { 
                    case '+': 
                    st.push(value2 + value1); 
                    break; 
                      
                    case '-': 
                    st.push(value2 - value1); 
                    break; 
                        
                    case '*': 
                    st.push(value2*value1); 
                    break; 
                    case '/': 
                    st.push(value2/value1); 
                    break; 
              } 
            } 
        } 
        return st.pop(); 
    } 
     
    public static void main(String[] args)  
    { 
        Scanner sc=new Scanner(System.in);
      String exp=sc.nextLine(); 
      System.out.println("Result :" +evalPostfix(exp)); 
    } 
} 
