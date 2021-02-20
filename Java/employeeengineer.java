class Employee
{
    String className = this.getClass().getName();
    public int salary=10000;
    public void display()
    {
        System.out.print("\nName of class is "+className);
    }
    public void calcSalary()
    {
        System.out.print("\nSalary of employee is "+salary);
    }

}

 class Engineer extends Employee{

}

public class employeeengineer
{
    public static void main(String[] args)
    {
        Engineer eng = new Engineer();
        eng.salary=20000;
    
        System.out.println("\n\nEngineer Class Methods: ");
        eng.display();
        eng.calcSalary();
        System.out.println("\n");

    }
}
