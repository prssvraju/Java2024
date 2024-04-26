import java.sql.*;  
public class UpdateData 

{  
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException  
    {
        // JDBC Driver name and database URL  
        String url = "jdbc:mysql://localhost: 3306/Studentdata";  
        // Database credentials  
        String user = "root";  
        String pass = "root";  
        Connection con;  
        Statement st;  
        try
        {
              Class.forName("com.mysql.jdbc.Driver");  
              // opening the connection  
              System.out.println("Connecting to Database Studentdata");
              con = DriverManager.getConnection(url, user, pass);  
              System.out.println("Connected database successfuly");  
              // Executing the query  
              st = con.createStatement();  
              String sql = "UPDATE Ec_student SET marks = '60' where id=349"; 
              st.executeUpdate(sql);  
              System.out.println("Data updated successfully");  
              st.close();  
              con.close();  
        } 
        catch(SQLException e)
        {  
            System.err.println(e);  
        } 
    }
}

