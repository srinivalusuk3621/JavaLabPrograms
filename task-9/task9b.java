import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class task9b {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "Ksv@1122";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to MySQL database");
            String query = "INSERT INTO student VALUES (?, ?)";

            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, 4);
            pst.setString(2, "Rahul");

            int rows = pst.executeUpdate();

            if (rows > 0) {
                System.out.println("Record inserted successfully");
            }

            pst.close();
            con.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
