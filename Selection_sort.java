import java.util.*;
class SelectionSort{
    public void sortingArray(int arr[])
    {
        int n=arr.length;
        int min_index;
        for(int i=0;i<n-1;i++)
        {
            min_index=i;
             for(int j=i+1;j<n;j++)
             {
                 if(arr[j]<arr[min_index])
                 {
                     min_index=j;
                 }
             }
              int temp;
                     temp=arr[min_index];
                     arr[min_index]=arr[i];
                     arr[i]=temp;
        }
    }
    public void printArray(int arr[])
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
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        SelectionSort obj=new SelectionSort();
        obj.sortingArray(arr);
        obj.printArray(arr);
    }
}
