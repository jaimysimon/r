import java.util.Scanner;

public class frequency
{
    public static void main(String[] args)
    { 
        String str;
         Scanner in = new Scanner(System.in);
         System.out.print("Enter a string: ");
        str = in.nextLine();      
        String s=str.toLowerCase();
        char ch;
        System.out.print("Enter a character to find the frequency: ");
        ch=in.next().charAt(0);

        int f=0;

        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)==ch)
                f++;
        }

        System.out.println("Frequency of "+ch+" in "+str+" is "+f);
    }
}