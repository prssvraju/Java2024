import java.sql.*;
public class InsertData 
{  
    public static void main(String[] args) throws SQLException,  ClassNotFoundException 
    {  
        String url = "jdbc:mysql://localhost:3306/studentdata";  
        String user = "root"; 
        String pass = "root";  
        Connection con;  
        Statement st;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            // get connection to database  
            con = DriverManager.getConnection(url, user, pass);  
            // creating the statement  
            st = con.createStatement();  
            // executing the sql query  
            String sql;  
            sql = "insert into Ec_student"  + "(id, firstname, lastname, marks)" + "values('349', 'Priya', 'Jaiswal', '57')";  
            st.executeUpdate(sql);  
        } 
        catch(SQLException e)
        {  
            System.err.println(e); 
        }  
    }
}

