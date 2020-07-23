import java.util.Scanner;

public class main {

    public static void main(String[] args)
    {
        int m=Integer.MIN;

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int a[] = new int[n];

        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            if(a[i]>m)
            {
                m=a[i];
            }
        }

        System.out.println(m);
    }
}
