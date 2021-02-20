class thread1 extends Thread{
    public void run(){
      System.out.println("\nOdd Numbers: ");
   for (int i = 1; i <= 100; i++) {
      if (i % 2!= 0) 
       System.out.print(i + " ");
      }
   System.out.println("");
}
   }
class thread2 extends Thread{
   public void run(){
    System.out.println("\nEven Numbers: ");
           for (int i = 1; i <= 100; i++) {
               if (i % 2 == 0) 
                System.out.print(i + " ");
               }
}
}

public class prioritythread {
    public static void main(String args[])
    {
       thread1 t1= new thread1();
       thread2 t2 =new thread2();
t1.setPriority(1);  
t2.setPriority(1);  
         t2.start();  
         try
           { 
               
               t2.join(); 
           } 
     
           catch(InterruptedException ex) 
           { 
               System.out.println("Exception has " + 
                                   "been caught" + ex); 
           } 
      
           t1.start(); 
   
}
}