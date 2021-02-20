import java.io.*;
import java.util.Scanner;
public class files {
	
	public static void main(String[] args) {
		FileOutputStream fout=null;
		String str;
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the content to enter the file: ");
		str= in.nextLine();
		String fpath="/Users/jaimysimon/Java/first.txt";
		try 
		{
			fout=new FileOutputStream(fpath);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}

		try 
		{
			for(int i=0;i<str.length();i++)
            {
              fout.write((int)str.charAt(i));
            }
		}
		catch(IOException e) 
		{
			System.out.println("Error in writing to file");
		}
		try {
			fout.close();
		}
		catch(IOException e)
		{
			System.out.println("Error in closing file");
		}
		System.out.println("\n");
		
		FileInputStream fin=null;
		try 
		{
			fin=new FileInputStream(fpath);
		}
		catch(FileNotFoundException f)
		{
			System.out.println("File not found");
		}
		int j;
		try{
			System.out.print("Content from file: ");
			j=fin.read();
			while(j!=-1){
			  System.out.print((char)j);
			  j=fin.read();
			}
		}
		catch(IOException e){
			System.out.println("Error in reading to file");
		}
		try{
			fin.close();
		}
		catch(IOException e){
			System.out.println("Error in closing file");
		}
		System.out.println("\n");
	

		
	}
}
