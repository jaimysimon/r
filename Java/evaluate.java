public class evaluate{
public static void main(String[] args) 
{ 
    //Initial values 
    int a = 60; 
    int b = 13; 

    // bitwise and 
    
    System.out.println("a&b = " + (a & b)); 

    // bitwise or 
   
    System.out.println("a|b = " + (a | b)); 

    // bitwise xor 
   
    System.out.println("a^b = " + (a ^ b)); 

    // bitwise and 
    // ~0101=1010 
    // will give 2's complement of 1010 = -6 
    System.out.println("~a = " + ~a); 

    // left shift operator 
        // 0000 0101<<2 =0001 0100(20) 
        // similar to 5*(2^2) 
        System.out.println("a<<2 = " + (a << 2)); 
  
        // right shift operator 
        // 0000 0101 >> 2 =0000 0001(1) 
        // similar to 5/(2^2) 
        System.out.println("a>>2 = " + (a >> 2)); 
  
        // unsigned right shift operator 
        System.out.println("a>>>2 = " + (a >>> 2)); 

     
} 
}
