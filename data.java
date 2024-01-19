
import java.sql.*;
import java.io.*;
 public class data {
    
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "Deepak@123"; // Corrected the variable name
            Connection con = DriverManager.getConnection(url, username, password);
            //create a query
            String q="insert into Deep(tName,tCity)values (?,?)";
            PreparedStatement pstmt =con.prepareStatement(q);
            // set value 
            pstmt.setString(1, "Deepak gurjar");
            pstmt.setString(2,"Deoli");

            pstmt.executeUpdate();
            System.out.println("Done");
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
