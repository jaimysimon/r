import java.util.Scanner;
abstract class shape{
    abstract void numberOfSides();
}
class rectangle extends shape{
    void numberOfSides(){
        System.out.println("\n\nThe number of Sides of Rectangle is 4");
    }
}
class triangle extends shape{
    void numberOfSides(){
        System.out.println("The number of Sides of Triangle is 3");
    }
}
class hexagon extends shape{
    void numberOfSides(){
        System.out.println("The number of Sides of Hexagon is 6");
    }
}
public class shapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rectangle r = new rectangle();
        triangle t = new triangle();
        hexagon h = new hexagon();
        r.numberOfSides();
        t.numberOfSides();
        h.numberOfSides();
        System.out.println("\n");
    }
}