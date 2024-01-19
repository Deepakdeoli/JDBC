import java.sql.*;

public class jdbcTesting {
    public static void main(String... args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/teacher";
            String username = "root";
            String password = "Deepak@123"; // Corrected the variable name
            Connection con = DriverManager.getConnection(url, username, password);

            if (con.isClosed()) {
                System.out.print("Connection closed");
            } else {
                System.out.print("created....");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
