import java.util.*;
class MergeSort{
    public void sort(int arr[])
    {
        int n=arr.length;
        if(n<2)
        return;
        int mid=n/2;
        int l[]=new int[mid];
        int r[]=new int[n-mid];
        for(int i=0;i<mid;i++)
        {
            l[i]=arr[i];
        }
        for(int i=mid;i<n;i++)
        {
            r[i-mid]=arr[i];
        }
        sort(l);
        sort(r);
        merge(l,r,arr);
    }
    public void merge(int l[],int r[],int arr[])
    {
        int n1=l.length;
        int n2=r.length;
        int i=0,j=0,k=0;
        while(i<n1 && j<n2)
        {
            if(l[i]<=r[j])
            {
                arr[k]=l[i];
                k=k+1;
                i=i+1;
            }
            else
            {
                arr[k]=r[j];
                k=k+1;
                j=j+1;
            }
        }
        while(i<n1)
        {
            arr[k]=l[i];
            k=k+1;
            i=i+1;
        }
        while(j<n2)
        {
            arr[k]=r[j];
            k=k+1;
            j=j+1;
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
        MergeSort obj=new MergeSort();
        obj.sort(arr);
        obj.print(arr);
    }
}
