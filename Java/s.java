import java.sql.*;
import java.util.Scanner;

public class s {

    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        String url="jdbc:mysql://localhost:3306/lab";
        int n,i;
        String userdata;
        String query1="Insert into student values(?,?,?)";
        String query2="select* from student where cgpa >= 7";
        System.out.println("Enter the no. of students:");
        n=sc.nextInt();
        Double gpa[]= new Double[n];
        String Name[]=new String[n];
        Integer rno[]=new Integer[n];
        for(i=0;i<n;i++)
        {
        System.out.println("\nDetails: ");
          System.out.println("Enter the Roll No.: ");
          rno[i]=sc.nextInt();
          System.out.println("Enter the Name: ");
          Name[i]=sc.next();
          System.out.println("Enter the CGPA: ");
          gpa[i]=sc.nextDouble();
        }
        sc.close();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,"root", "#Femy1051");
            PreparedStatement sp= con.prepareStatement(query1);
            for(i=0;i<n;i++)
            {
                sp.setInt(1, rno[i]);
                sp.setString(2, Name[i]);
                sp.setDouble(3, gpa[i]);
                sp.executeUpdate();
            }
            System.out.println(i+" row/s affected");
            sp.close();
            con.close();
        }
       catch(Exception e)
       {
          System.out.println(e);
       } 
       try {
          Connection con = DriverManager.getConnection(url,"root", "#Femy1051");
           Statement st = con.createStatement();
           ResultSet rs =st.executeQuery(query2);
           System.out.println("\nDetails of student with cgpa >=7: ");
           while(rs.next())
           {
             userdata=rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getDouble(3);
             System.out.println(userdata);
           }
           st.close();
           con.close();
       } catch (Exception e) {
           System.out.println(e);
       }
    }
}