import java.sql.*;  
public class DisplayData 
{  
    static final String url = "jdbc:mysql://localhost:3306/studentdata";
    // providing database credentials  
    static final String user = "root";  
    static final String pass = "root";  
    public static void main(String []args) throws SQLException, ClassNotFoundException  
    {  
        Connection con;  
        Statement st;  
        ResultSet rs;  
        try
        {  // registering the JDBC Driver  
            Class.forName("com.mysql.jdbc.Driver");  
            con = DriverManager.getConnection(url, user, pass); 
            System.out. println("connected to database");  
            // Executing the query  
            st = con.createStatement();  
            String sql = "select * from Ec_student";  
            rs = st.executeQuery(sql);  
            // Extracting the data from result set  
            while(rs.next())
            {  
                // Retrieving by column name  
                int id = rs.getInt("id");  
                String firstname = rs.getString("firstname");  
                String lastname = rs.getString("lastname");  
                int marks = rs.getInt("marks");  
                // Displaying the values  
                System.out.print("ID:" + id);  
                System.out.print(", First name:" + firstname);  
                System.out.print(", Last name:" + lastname);  
                System.out.print(", Marks:" + marks);           
            }  
            rs.close();  
            st.close();  
            con.close();  
        } catch(SQLException e)
        {  
            System.err.println(e);  
        }  
    }  
} 

