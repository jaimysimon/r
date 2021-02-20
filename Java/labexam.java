import java.io.*;
import java.util.*;
import java.lang.*;

public class labexam {

    public static void main(String args[]) {
        StringBuilder fpath = new StringBuilder("/Users/jaimysimon/Java/");
        StringBuilder fpath2 = new StringBuilder("/Users/jaimysimon/Java/");

        StringBuilder str = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for (int i = 0; i < args.length; i++) {
            str.append(args[0]);

        }
        int l = str.length();
        str.delete(l / 2, l);

        fpath.append(str);
        for (int i = 0; i < args.length; i++) {
            str2.append(args[1]);
        }
        int k = str2.length();
        str2.delete(k / 2, k);

        fpath2.append(str2);

        String path = fpath.toString();
        String path2 = fpath2.toString();

        FileInputStream fin = null;
        FileOutputStream fout = null;
        try {
            fin = new FileInputStream(path);
            fout = new FileOutputStream(path2);
        } catch (FileNotFoundException e) {
            System.out.println("File/s not Found");
        }
        String s = "";
        try {
            System.out.print("Content in file " + str + ": ");

            int j;

            j = fin.read();
            do {

                System.out.print((char) j);

                s += (char) j;
                j = fin.read();

            } while (j != -1);

        } catch (IOException e) {
            System.out.println("Error in Reading the File");
        }

        char[] arr = s.toCharArray();
        try {
            int count;

            for (int i = 0; i < s.length(); i++) {
                count = 1;
                for (int j = i + 1; j < s.length(); j++) {
                    if (arr[i] == arr[j]) {
                        count++;

                    }
                }

                if (count == 1) {
                    fout.write((char) arr[i]);
                }

            }
        } catch (IOException e) {
            System.out.println("Error in Writing into the File");
        }

        FileInputStream f = null;
        try {
            f = new FileInputStream(path2);
        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
        }

        try {
            System.out.print("Content in file " + str2 + ": ");

            int j;

            j = f.read();
            do {

                System.out.print((char) j);

                j = f.read();

            } while (j != -1);

        } catch (IOException e) {
            System.out.println("Error in Reading the File");
        }

        try {

            fin.close();
            f.close();
            fout.close();

        } catch (IOException e) {
            System.out.println("Error in Closing the files");
        }

    }
}
