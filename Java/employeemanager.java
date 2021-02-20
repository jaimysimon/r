import java.util.Scanner;

class Employeee
{
    String Name;
    int Age;
    String PNo;
    String Address;
    double salary;
    void print_salary()
    {
        System.out.print("\nSalary: "+salary);
    }

}
class Officer extends Employeee
{
    private static Scanner sc;
    String Spec;
    void getvalue()
    {
        sc = new Scanner(System.in);
        System.out.print("\nEnter Name: ");
        Name=sc.nextLine();
        System.out.print("\nEnter Age: ");
        Age=sc.nextInt();
        sc.nextLine();
        System.out.print("\nEnter Phone No.: ");
        PNo=sc.nextLine();
        System.out.print("\nEnter Address: ");
        Address=sc.nextLine();
        System.out.print("\nEnter Salary: ");
        salary=sc.nextDouble();
        sc.nextLine();
        System.out.print("\nEnter Specialization: ");
        Spec=sc.nextLine();

    }
    void printvalue()
    {
        System.out.print("\nName: "+Name);
        System.out.print("\nAge: "+Age);
        System.out.print("\nPhone No.: "+PNo);
        System.out.print("\nAddress: "+Address);
        print_salary();
        System.out.print("\nSpecialization: "+Spec);

    }
}
class Manager extends Employeee
{
    private static Scanner sc;
    String Dept;
    void getvalue()
    {
        sc = new Scanner(System.in);
        System.out.print("\nEnter Name: ");
        Name=sc.nextLine();
        System.out.print("\nEnter Age: ");
        Age=sc.nextInt();
        sc.nextLine();
        System.out.print("\nEnter Phone No.: ");
        PNo=sc.nextLine();
        System.out.print("\nEnter Address: ");
        Address=sc.nextLine();
        System.out.print("\nEnter Salary: ");
        salary=sc.nextDouble();
        sc.nextLine();
        System.out.print("\nEnter Department: ");
        Dept=sc.nextLine();

    }
    void printvalue()
    {
        System.out.print("\nName: "+Name);
        System.out.print("\nAge: "+Age);
        System.out.print("\nPhone No.: "+PNo);
        System.out.print("\nAddress: "+Address);
        print_salary();
        System.out.print("\nDepartment: "+Dept);

    }
}
public class employeemanager
{
    private static Scanner sc;
    public static void main(String[] args)
    {
        sc = new Scanner(System.in);
        Officer off = new Officer();
        Manager Man = new Manager();
        System.out.println("\nEnter Details of Officer: ");
        off.getvalue();
        System.out.println("\nEnter Details of Manager: ");
        Man.getvalue();
        System.out.println("\n\nDetails of Officer: ");
        off.printvalue();
        System.out.println("\n\nDetails of Manager: ");
        Man.printvalue();
        System.out.println("\n");

    }
}