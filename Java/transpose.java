import java.util.Scanner;  
public class transpose   
{  
    public static void main(String args[])    
    {  
    int i, j;  
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the no. of Rows: ");  
    int row = s.nextInt(); 
    System.out.println("Enter the no. of Columns: "); 
    int column = s.nextInt();  
    int array[][] = new int[row][column]; 
    int r=column;
    int c=row;
    int trans[][] = new int[r][c];
    
    System.out.println("Enter the Elements of the Matrix:");  
    for(i = 0; i < row; i++)  
    {  
        for(j = 0; j < column; j++)   
            { System.out.print(" ");  
            array[i][j] = s.nextInt();  
             
            }  
    }  

    for(i = 0; i < r; i++)  
    {  
        for(j = 0; j < c; j++)   
            {   
            trans[i][j]=array[j][i]; 
             
            }  
    }  

    System.out.println("Original Matrix: " );  
    for(i = 0; i < row; i++)  
        {  
            for(j = 0; j < column; j++)  
            {  
            System.out.print(array[i][j]+" ");  
            }  
            System.out.println(" ");  
        }  


    System.out.println("Transpose Matrix: ");  
    for(i = 0; i < r; i++)  
        {  
            for(j = 0; j < c; j++)  
            {  
                System.out.print(trans[i][j]+" ");  
            }  
            System.out.println(" ");  
        }  
    }  
}