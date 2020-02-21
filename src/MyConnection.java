
import java.sql.*;

public class MyConnection {
    
    public static Connection getConnection()
    {
        Connection conn = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Sign_Up_Details?zeroDateTimeBehavior=convertToNull","root","rootpassword");
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return conn;
    }
    
}
