import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class task9a
{
    public static void main(String args[])
    {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "Ksv@1122";

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to MySQL database");
            String query = "SELECT * FROM student";

            PreparedStatement pst = con.prepareStatement(query);

            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                int id = rs.getInt("id");
                String name = rs.getString("name");

                System.out.println("ID: " + id + " Name: " + name);
            }

            rs.close();
            pst.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
