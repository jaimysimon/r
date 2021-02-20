import java.util.Scanner;

public class secondsmallest {
    public static void main(String abc[]){
        int temp,n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements in the array: ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < a.length; i++)   
        {  
            for (int j = i + 1; j < a.length; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
        int[] b = new int[100];  
        int j = 0;  
        for (int i=0; i<a.length-1; i++){  
            if (a[i] != a[i+1]){  
                b[j++] = a[i];  
            }  
         }  
        b[j++] = a[a.length-1]; 
        System.out.println("The second smallest number in the given array:  " + b[1]);

    }
    
}