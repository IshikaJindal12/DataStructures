import java.util.*;
public class bubbleSort
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,j,temp;
		n=sc.nextInt();
		int[] a=new int[n];
    System.out.println("Array elements:- ");
		for(i=0;i<a.length;i++)
		{
		    a[i]=sc.nextInt();
		   
		}
	for(i=0;i<a.length;i++)
	{
	    for(j=i;j<a.length;j++)
	    {
	        if(a[j]<a[i])
	        {
	            temp=a[j];
	            a[j]=a[i];
	            a[i]=temp;
	        }
	    }
	}
  System.out.println("Array after sorting:- ");
  for(i=0;i<a.length;i++)
	{
	    System.out.print(a[i]+" ");
	}
		   
		
		
	}
}
