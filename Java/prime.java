import java.util.Scanner;

public class prime
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in); 
        int num;
        System.out.println("Enter the number to check whether it is prime or not: ");
        num = in.nextInt();  
        System.out.println("Input Number: "+num);
          
        int flag=0;

        if(num<0)
            System.out.println("Invalid input");
        else if (num==0||num==1)
            System.out.println(num+" is neither prime nor composite");
        else
        {
            for (int i = 2; i <= num / 2; i++)
                if (num % i == 0)
                {
                    flag = 1;
                    break;
                }

            if (flag==0)
                System.out.println(num+" is a prime number");
            else
                System.out.println(num+" is not a prime number");
        }
    }
}