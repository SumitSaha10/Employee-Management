import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
    public static Connection con;
    
    public static Connection createCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.driver");
            String url = "jdbc:mysql://localhost:3306/employee";
            String user = "root";
            String password = "khalnayak10";
            con = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
    
}
