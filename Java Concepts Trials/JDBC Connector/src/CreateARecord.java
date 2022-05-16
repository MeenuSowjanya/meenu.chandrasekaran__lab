import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateARecord {
    static final String DB_URL = "jdbc:mysql://localhost:3306/STUDENTS";
    static final String USER = "smile";
    static final String PASS = "Password@1234";

    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        ) {
            String sql = "INSERT INTO REGISTRATION VALUES(1,'Meenu','Sowjanya',18)";;
            stmt.executeUpdate(sql);
            System.out.println("Record created successfully...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
