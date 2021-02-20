import java.io.*;
public class countfile {

	public static void main(String[] args) {
		int i,ch=0,lin=1,word=1;
		FileInputStream fin;
		try {
			fin=new FileInputStream("/Users/jaimysimon/Java/Example.txt");
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
			return;
		}
		try 
		{
			System.out.println("File Content: ");
			 do
			{
			i=fin.read();
			if(i!=-1)
			{						
				System.out.print((char)i);
				switch((char)i)
				{
				case '\n':lin++;
							word++;
							break;
				case ' ':word++;
							break;
						
				default:ch++;
				}
			}
			}while(i!=-1);
		}
		catch(IOException e) 
		{
			System.out.println("Error in reading file");
		}
		System.out.println();
		System.out.println();
		System.out.println("Number of characters : "+ (ch-lin+2));
		System.out.println("Number of word : "+word);
		System.out.println("Number of lines :"+lin);
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