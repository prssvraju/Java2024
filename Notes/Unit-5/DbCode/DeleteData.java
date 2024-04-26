import java.sql.*;  
public class DeleteData 
{  
    public static void main(String[] args) throws SQLException, ClassNotFoundException 
    {  
        String url = "jdbc:mysql://localhost:3306/studentdata";  
        // providing database credentials 
        String user = "root";  
        String pass = "root";  
        Connection con;  
        Statement st;  
        try
        {  
            // registering the JDBC Driver  
            Class.forName("com.mysql.jdbc.Driver"); 
            System.out.println("connecting to database");  
            con = DriverManager.getConnection(url, user, pass);  
            System.out.println("connected to database successfully");
            // Executing the query  
            st = con.createStatement();  
            String sql = "Delete from Ec_student" + "where id = 345";  
            st.executeUpdate(sql);  
            st.close();  
            con.close();  
        } 
        catch(ClassNotFoundException ex) 
        {  
            ex.printStackTrace();  
        } catch(SQLException e)
        {  
            e.printStackTrace();  
        }
    }
}


