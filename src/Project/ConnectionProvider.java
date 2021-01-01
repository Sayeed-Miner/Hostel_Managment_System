package Project;
import java.sql.*;

/**
 *
 * @author SAYEED
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
            return con;
        } 
        catch (Exception e) 
        {
            return null;
        }
    }
}