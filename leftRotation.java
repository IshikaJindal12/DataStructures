import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class rotateLeft {



    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        int d = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        
        int j=0;
        int b[] = new int[n];

        for(int i=d;i<n;i++)
        {
            b[j]=a[i];
            j++;
        }

        for(int i=0;i<d;i++)
        {
            b[j]=a[i];
            j++;
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(b[i]+ " ");
        }
    }


}
