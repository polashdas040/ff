import java.sql.Connection;
import java.sql.DriverManager;


public class MyConnection {

    public static Connection getConnection() {
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/university_dormitory", "root", "polash");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return con;
    }
}
