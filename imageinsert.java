import java.io.*;
import java.sql.*;

public class imageinsert {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Deep", "root", "Deepak@123");
            String q = "insert into images(pic) value(?)";
            PreparedStatement pstmt = con.prepareStatement(q);
            FileInputStream fis = new FileInputStream(
                    "\"C:\\Users\\Pukhraj Singh Gurjar\\Desktop\\'\\JDBC\\DSC_0296.JPG\"");
            pstmt.setBinaryStream(1, fis, fis.available());
            pstmt.executeUpdate();
            System.out.println("Done.....");

        } catch (Exception e) {
            System.out.println("Error...!!");
        }
    }
}
