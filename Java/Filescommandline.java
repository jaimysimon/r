import java.io.*;
public class Filescommandline {

	public static void main(String[] args) {
		if(args.length==0)
		{
			System.out.println("Enter correct name of file");
			System.exit(0);
		}
		else
		{
			FileInputStream fin=null;
			int k;
			for(int i=0;i<args.length;i++)
			{
				try {
					System.out.println("Contents of file "+(i+1));
					fin=new FileInputStream(args[i]);
				} catch (FileNotFoundException e) {
					
					System.out.println("File not found");
					System.exit(0);
				}
				try {
					do {
					 k=fin.read();
					 if(k!=-1) {
					System.out.print((char)k);}
					}while(k!=-1);
					System.out.println();
				}
				catch(IOException e) {
					System.out.println("Error in reading file");
				}
			
			}
			try {
				fin.close();
			}
			catch(IOException e) {
				System.out.println("Error in closing file");
			}
		}
	}

}
