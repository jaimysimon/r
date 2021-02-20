import java.util.Scanner;
public class ReverseString
{
	public static void main(String args[])
	{
		String s,rev="";
         Scanner in = new Scanner(System.in);
         System.out.print("Enter a string: ");
        s = in.nextLine();      

		System.out.print("\nReversed string: ");
		for(int i=s.length(); i>0; i--)
		{
			rev=rev+(s.charAt(i-1));
		}
		System.out.println(rev);
    }
}