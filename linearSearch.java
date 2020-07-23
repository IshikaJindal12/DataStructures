import java.util.*;
public class searching
{
	public static void main(String[] args) {
	    
		Scanner scan=new Scanner(System.in);
		
		int s=scan.nextInt();
		int a[]=new int[s];
		
		for(int i=0;i<s;i++)
		a[i]=scan.nextInt();
		
		System.out.print("Searching Element: ");
		int element=scan.nextInt();
		
		for(int i=0;i<s;i++)
		{
		    if(a[i]==element)
		    {
		        System.out.print("Element found at "+i+" index");
		        break;
		    }
		}
	}
}
