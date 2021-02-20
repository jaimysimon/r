import java.io.*;
public class fileline {

	public static void main(String[] args) {
		int i,j=1;
		FileInputStream fin;
		try {
			fin=new FileInputStream("/Users/jaimysimon/Java/first.txt");
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
			return;
		}
		try 
		{
			System.out.println("Line by line File Content: ");
			System.out.print("1. ");
			 do
			{
			i=fin.read();
			if(i!=-1)
			{						
			if(i==(int)'\n')
			{
				j++;
				System.out.print("\n"+j+". ");
			}
			else
			{
				System.out.print((char)i);
			}
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