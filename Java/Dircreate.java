import java.io.*;
import java.util.*;
public class Dircreate {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the path to create directory");
		String ss=s.nextLine();
		System.out.println("Enter the name of directory");
		ss=ss+s.nextLine();
		File f=new File(ss);
		if(f.mkdir())
			System.out.println("Directory created");
		else
			System.out.println("Directory not created");
		if(f.isDirectory())
			System.out.println("Directory exists");
		else
			System.out.println("Directory not exists");
		System.out.println("");

	}

}
