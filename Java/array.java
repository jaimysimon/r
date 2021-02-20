public class array {  
    public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {1, 2, 3, 4, 5}; 
        int sum = 0;  
        int max = arr[0];  
          
        for (int i = 0; i < arr.length; i++) 
        {  
            
           if(arr[i] > max) //Compare elements of array with max   
               max = arr[i];  
        }  
        // calculate sum of elements  
        for (int i = 0; i < arr.length; i++)
        {  
           sum = sum + arr[i];  
        }  
        System.out.println("Elements of given array: ");  
        //display array  
        for (int i = 0; i < arr.length; i++) 
        {  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println("Sum of all the elements of an array: " + sum); 
        System.out.println("Largest element present in given array: " + max);
    }  
}  