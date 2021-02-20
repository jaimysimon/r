import java.util.*;
import java.lang.Package;

public class charseq implements CharSequence {
    private String s;

    public charseq() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: "); 
        s=sc.nextLine();
    }

    public char charAt(int i) {
        return s.charAt(i);
    }

    public int length() {
        return s.length();
    }

    public CharSequence subSequence(int start, int end) {
        
        StringBuilder sub = new StringBuilder(s.subSequence(start,end));
        return sub.reverse();
    }

    public String toString() {
        StringBuilder s = new StringBuilder(this.s);
        return s.reverse().toString();
    }

    public static void main(String[] args) {
        charseq s =new charseq();     
        for (int i =s.length()-1; i >=0; i--) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
        int start =0;
        int end = s.length();
        System.out.println(s.subSequence(start, end));
        System.out.println(s.toString());
    }
}