import java.io.*;
public class FileCreate {

	public static void main(String[] args) {
		FileOutputStream fout = null;
		String k="/Users/jaimysimon/Java/abc.txt";
		int i;
		try 
		{
			System.out.println("File name created is "+"abc.txt");
			fout=new FileOutputStream(k);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File can't create");
			return;
		}		
		try {
			fout.close();
		}
		catch(IOException e)
		{
			System.out.println("Error in closing file");
		}
		File f=new File(k);
		if(f.exists())
			System.out.println("File exists");
		else
			System.out.println("File not exists");
		String dir="C:\\java";
		File ff=new File(dir);
		if(ff.isDirectory())
			System.out.println("File is in "+dir);
		else
			System.out.println("File is not in "+dir);
		if(f.isFile())
			System.out.println("It is a File");
		else
			System.out.println("It is not a File");
		System.out.println("Name of File is "+f.getName());
		System.out.println("Absolute Directory is "+f.getAbsolutePath());
		//System.out.println("");
	}

}
