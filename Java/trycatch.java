import java.util.Scanner;

class Minimum_age_to_vote_not_attained extends Exception
{
    public Minimum_age_to_vote_not_attained(String str)
    {
        System.out.println(str);
    }
}

public class trycatch
{
    public static void main(String[] args) throws Minimum_age_to_vote_not_attained
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try
        {
            if (age<18)
            throw new Minimum_age_to_vote_not_attained("\nYou are not eligible to vote");
        else
            System.out.println("\nYou are eligible to vote");
        }

        catch (Minimum_age_to_vote_not_attained e)
        {
            System.out.println(e);
        }

        finally
        {
            System.out.println("The minimum age to vote is 18");
        }
    }
}