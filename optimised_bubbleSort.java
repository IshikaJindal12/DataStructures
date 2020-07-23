public class BubbleSort
{
	public static void main(String[] args) {
	    
		Scanner scan=new Scanner(System.in);
		
		int s=scan.nextInt();
		int a[]=new int[s];
		
		for(int i=0;i<s;i++)
    {
		a[i]=scan.nextInt(); //scan array elements
    }
		
		for(int i=0;i<s-1;i++)
		{
		    boolean flag=true;  //optimised sorting O(n)
		    for(int j=0;j<s-i-1;j++)
		    {
		        if(a[j]>a[j+1])
		        {
		            int temp=a[j+1];
		            a[j+1]=a[j];
		            a[j]=temp;
		            flag=false;
		        }
		    }
		    if(flag==true)
		    break;
		}
		
		System.out.print("Array after SORTING : ");
		for(int i=0;i<size;i++)
		{
		    System.out.print(arr[i]+" "); //printing after sorting
		}
	}
}
