import java.util.*;
public class binarysearch {
   public static void main (String[] args) {
      ArrayList<Integer> arr = new ArrayList<Integer>();
      
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the no of elements in the array: ");
      int n = scanner.nextInt();
      System.out.println("Enter the elements of the array: ");
      for (int i = 0; i <n; i++) 
      {   int no = scanner.nextInt();
          arr.add(no); 
      }
      System.out.print("\nThe array is: ");
      System.out.println(arr); 
          int s;
          System.out.print("\nEnter the number to be searched: ");
          s = scanner.nextInt();
          Collections.sort(arr);
     int pos = Collections.binarySearch(arr, s);

     if (pos<0)
     {
        System.out.println("The element is not present in the array");
     }
     else{
        System.out.println("The element's first occurance is at position "+pos);
     }
  
   }
}