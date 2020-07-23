class searching{  
 public static void binaryS(int array[], int start, int end, int k)
 {
 
   int mid = (start + end)/2;  
   while( start <= end )
   {  
      if ( array[mid] < k )
      {  
        start = mid + 1;     
      }
      
      else if ( array[mid] == k )
      {  
        System.out.println("Element FOUND: " + mid);  
        break;  
      }
      
      else
      {  
         end = mid - 1;  
      }  
      mid = (start + end)/2;  
   }  
   
   if ( start > end )
   {  
      System.out.println("NOT FOUND");  
   }  
 }  
 
 public static void main(String args[])
 {  
        int array[] = {10,20,30,40,50};  
        int k = 30;  
        int end=array.length-1;  
        binaryS(array,0,end,k);     
 }  
}  
