//Illustration of using some of the methods of ResultSetMetaData interface 

import java.sql.*;  
public class ResultSetDemo 
{  
    static final String url = "jdbc:mysql://localhost:3306/studentdata";  
    static final String driver = "com.mysql.jdbc.Driver";  
    // providing database credentials 
     static final String user = "root";  
     static final String pass = "root";  
     public static void main(String[] args)
     {  
        Connection con;  
        try
        { 
            Class.forName("com.mysql.jdbc.Driver");  
            System.out. println("connecting to a selected database");  
            con = DriverManager.getConnection(url, user, pass);  
            System.out. println("connected to database"); 
            PreparedStatement ps = con.prepareStatement("select * from SubjectChoice");  
            ResultSet rs = ps.executeQuery();  
            ResultSetMetaData rd = rs.getMetaData();  
            System.out.println("Total columns: " + rd.getColumnCount());  
            System.out.println("Column name of first column: " + rd.getColumnName(1));  
            con.close();  
        } catch(Exception e)  
        {
            System.out.println(e);  
        }  
    }  
} 
