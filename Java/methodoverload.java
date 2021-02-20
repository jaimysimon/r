import java.util.Scanner;
class overload
{
    void area(double x, float y)
    {   double area = 0.5*x*y;
        System.out.println("The Area of the Triangle is "+area+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("The Area of the Rectangle is "+x*y+" sq units");
    }
    void area(float r)
    {
        double a = (3.14 * r * r);
        System.out.println("The Area of the Circle is "+a+" sq units");
    }
}

public class methodoverload
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU:");
        System.out.println("\n1.Area of a Circle");
        System.out.println("2.Area of a Rectangle");
        System.out.println("3.Area of a Triangle");
        System.out.println("\nEnter your choice to find area: ");
        int ch = sc.nextInt();
        overload ob = new overload();
        if(ch==1)
        {
            System.out.println("Enter Radius: ");
            float r=sc.nextInt();
            ob.area(r);

        }
        else if(ch==2)
        {
            System.out.println("Enter Length: ");
            int l= sc.nextInt();
            System.out.println("Enter Breadth: ");
            int b= sc.nextInt();
            ob.area(l,b);
        }
        else if (ch==3)
        {
            System.out.println("Enter Length of Base: ");
            double b=sc.nextDouble();
            System.out.println("Enter Length of Height: ");
            float h= sc.nextFloat();
            ob.area(b,h);
        }
    }
}
