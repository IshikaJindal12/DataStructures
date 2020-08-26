import java.util.*;
class QuickSort{
    int  partition(int arr[],int start,int end)
    {
        int pivot=arr[end];
        int p_index1=start;
        for(int i=start;i<end;i++)
        {
            if(arr[i]<=pivot)
            {
                int temp=arr[i];
                arr[i]=arr[p_index1];
                arr[p_index1]=temp;
                p_index1=p_index1+1;
            }
        }    
            int temp1=arr[p_index1];
            arr[p_index1]=arr[end];
            arr[end]=temp1;
            return p_index1;
    }
    public void sort(int arr[],int start,int end)
    {
        if(start<end)
        {
            int p_index=partition(arr,start,end);
            sort(arr,start,p_index-1);
            sort(arr,p_index+1,end);
        }
    }
    public void print(int arr[])
    {
        int n=arr.length;
        System.out.println("Array after sorting: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        QuickSort obj=new QuickSort();
        obj.sort(arr,0,n-1);
        obj.print(arr);
    }
}
