public class garbage {
    public static void main(String[] args) {
     Gcollector g =new Gcollector();
     g=null; 
     System.gc();  
    }
}
class Gcollector{
    protected void finalize() throws Throwable{
        System.out.println("Garbage Collector Invoked :"+this);
    }
}