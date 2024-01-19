import java.sql.*;

public class insertjdbc {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "Deepak@123"; // Corrected the variable name
            Connection con = DriverManager.getConnection(url, username, password);

            // create query
            String q = " create table Deep (tld int(20)primary key auto_increment,tName varchar (200) not null,tCity varchar(400))";
            // create a statement
            Statement stmt = con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("table created in database ");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
