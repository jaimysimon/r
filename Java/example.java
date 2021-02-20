import java.util.Scanner;
class Complex{
    double x;
    double y;

    Complex add(Complex z1, Complex z2)
    {
        Complex sum = new Complex();
        sum.x=0.0;
        sum.y=0.0;
        sum.x = z1.x + z2.x;
        sum.y = z1.y + z2.y;

        return sum;

    }
    Complex mul(Complex z1, Complex z2)
    {
        Complex product = new Complex();
        product.x= (z1.x*z2.x)-(z1.y*z2.y);
        product.y=(z1.x*z2.y)-(z1.y*z2.x);

        return product;
    }

    float magnitude(Complex z)	     
    {   double mod;
       mod= Math.sqrt(z.x * z.x + z.y * z.y);
       float modulus=(float) (mod);
        return modulus;
    }
    Complex conjugate(Complex z){
        Complex conj = new Complex();
       conj.x=z.x;
       conj.y=-z.y;
        return conj;
    }


}
public class example {
    public static void main(String[] args) {
        
       Scanner in = new Scanner(System.in);
       Complex z1 = new Complex();
       Complex z2 = new Complex();

       System.out.println("Enter the First Complex no:");
       System.out.println("Real part:");
       z1.x = in.nextInt(); 
       System.out.println("Imaginary part:");
       z1.y = in.nextInt(); 

       System.out.println("Enter the Second Complex no:");
       System.out.println("Real part:");
       z2.x = in.nextInt(); 
       System.out.println("Imaginary part:");
       z2.y = in.nextInt(); 
       Complex addition = new Complex();
       addition = addition.add(z1,z2);

               System.out.printf("Sum = %.1f + %.1fi", addition.x, addition.y);

               Complex multiply = new Complex();
               multiply  = multiply .mul(z1,z2);

               System.out.printf("Product = %.1f + %.1fi", multiply .x, multiply .y);

               float mod;
               Complex z = new Complex();
               System.out.println("Enter the Complex no:");
       System.out.println("Real part:");
       z.x = in.nextInt(); 
       System.out.println("Imaginary part:");
       z.y = in.nextInt(); 

             mod=z.magnitude(z);
             System.out.printf("Magnitutde = %.1fi", mod);

             Complex c = new Complex();
               System.out.println("Enter the Complex no:");
       System.out.println("Real part:");
       c.x = in.nextInt(); 
       System.out.println("Imaginary part:");
       c.y = in.nextInt(); 
      
       c  = c .conjugate(c);
       if (c.y<0)
       System.out.printf("Conjucate = %.1f %.1fi", c.x, c.y);
       else
       System.out.printf("Conjucate = %.1f + %.1fi", c.x, c.y);

          
    }
 }