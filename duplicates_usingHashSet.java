import java.util.HashSet;
import java.util.Set;
 
public class dup 
{
    public static void main(String[] args) 
    {
        int[] a = {0,1,0,-1,4,-1,6,7,8,8};
         
        Set<Integer> set = new HashSet<Integer>();
         
        for(int i = 0; i < a.length ; i++) 
        {
            if(set.add(a[i]) == false) 
            {
                System.out.println("element found : " + a[i]);
            }
        }
    }
}
