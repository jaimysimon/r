import java.io.*;
public class Filewithupperlower {

	public static void main(String[] args) {
		FileInputStream fin= null;
		int i;
		try 
		{
			fin=new FileInputStream("/Users/jaimysimon/Java/first.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			return;
		}
		try 
		{
			System.out.println("Contents of file is");
			 do
			{
			i=fin.read();
			if(i!=-1)
			{
			System.out.print(Character.toUpperCase((char)i));
			}
			}while(i!=-1);
		}
		catch(IOException e) 
		{
			System.out.println("Error in reading file");
		}
		try 
		{
			fin.close();
		}
		catch(IOException e)
		{
			System.out.println("Error in closing file");
		}	
	}

}
