import java.util.Scanner;

public class quicksort {
    
    int partition(String arr[], int low, int high) 
    { 
        String pivot = arr[high];  
        int i = low-1;
        for (int j=low; j<high; j++) 
        {  
            if (arr[j].compareToIgnoreCase(pivot)<0) 
            { 
                i++; 
                String temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
  
            } 
        } 
        String temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
  

    void sort(String arr[], int low, int high) 
    { 
        if (low < high) 
        {
            int pi = partition(arr, low, high); 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 
    
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in);
        String arr[] =new String[20];
        int no;
        System.out.print("Enter the number of names: "); 
        no = sc.nextInt();
        System.out.println("\nEnter the names: ");
        arr[0]=sc.nextLine();
        for(int i=0;i<no;i++)
        {
            arr[i]=sc.nextLine();
        } 
        quicksort qs=new quicksort();
        qs.sort(arr, 0, no-1); 
  
        System.out.println("\nSorted array of names: "); 
        for(int i=0;i<no;i++)
        {
            System.out.println(arr[i]);
        }  
        sc.close();
    } 
}