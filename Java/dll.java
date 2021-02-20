import java.util.*;
import java.lang.*;
public class dll {

    public static void main(String[] args) {
        LinkedList<Integer>list = new LinkedList<Integer>();
        Scanner sc =new Scanner(System.in);
        int ch,n;
        while (true) {
            System.out.println();
            System.out.println("DOUBLY LINKED LIST");
            System.out.println("1. Insert in Front");
            System.out.println("2. Insert in end");
            System.out.println("3. Delete from front");
            System.out.println("4. Delete from last");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the element to insert: ");
                    n=sc.nextInt();
                    list.addFirst(n);
                    break;
                case 2:
                    System.out.println("Enter the element to insert: ");
                    n=sc.nextInt();
                    list.addLast(n);
                    break;
                case 3:
                    list.removeFirst();
                    break;
                case 4:
                    list.removeLast();
                    break;
                case 5:
                    System.out.println("Doubly Linked List:");
                    for(Integer x: list)
                        System.out.print(x+" ");
                    System.out.println();   
                     break; 
                case 6:
                    sc.close();
                     System.exit(0);     
                default:
                    break;
            }
        }
        
    }
}