import java.util.*;
class InsertionSort{
    public void sortingArray(int arr[])
{
    int n=arr.length;
    int hole;
    for(int i=1;i<n;i++)
    {
        hole=i;
        int temp=arr[i];
        while(hole>0 && arr[hole-1]>temp)
        {
            arr[hole]=arr[hole-1];
            hole=hole-1;
        }
        arr[hole]=temp;
    }
}
public void printArray(int arr[])
{
    int n=arr.length;
    System.out.println("Array after Sorting: ");
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
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    InsertionSort obj=new InsertionSort();
    obj.sortingArray(arr);
    obj.printArray(arr);
    }
}
