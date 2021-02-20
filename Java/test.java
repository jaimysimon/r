import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.*;

class test {
    public static void main(String args[]) 
    {

        String fpath="/Users/jaimysimon/Java/first.txt";
        
        FileInputStream fin = null;
        try{
            fin = new FileInputStream(fpath);

        }
        catch(FileNotFoundException f)
        {
            System.out.println("File Not Found");
        }
            int i,ch=0,words=1, lines=1;
        try{
            
            
            do{
            i=fin.read();
            if(i!=-1)
            {
             switch((char)i)
            {case'\n':lines++;
            words++;
             break;
             case' ':words++;
             break;
             default: ch++;
            }
        }
            }while(i!=-1);
    
        }
        catch(IOException e)
        {
            System.out.println("Error in reading the file");
        }
        System.out.println("c:"+ch);
        System.out.println("l:"+lines);
        System.out.println("w:"+words);
        try{
            fin.close();
    
        }
        catch(IOException e)
        {
            System.out.println("Error in closing the file");
        }


    }
}
