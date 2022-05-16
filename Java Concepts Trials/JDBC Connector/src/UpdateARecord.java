import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class UpdateARecord {
    static final String DB_URL = "jdbc:mysql://localhost:3306/STUDENTS";
    static final String USER = "smile";
    static final String PASS = "Password@1234";

    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        ) {
            String sql = "UPDATE REGISTRATION SET last='Sowjanya C' where id=1";;
            stmt.executeUpdate(sql);
            System.out.println("Record updated successfully...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
