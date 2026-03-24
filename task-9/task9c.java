import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class task9c {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "Ksv@1122";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to MySQL database");
            String query = "DELETE FROM student WHERE id = ?";

            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, 4);

            int rows = pst.executeUpdate();

            if (rows > 0) {
                System.out.println("Record deleted successfully");
            } else {
                System.out.println("No record found with given ID");
            }

            pst.close();
            con.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
