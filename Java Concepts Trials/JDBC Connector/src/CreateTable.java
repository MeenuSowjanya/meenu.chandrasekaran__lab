import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    static final String DB_URL = "jdbc:mysql://localhost:3306/STUDENTS";
    static final String USER = "smile";
    static final String PASS = "Password@1234";

    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        ) {
            String sql = "CREATE TABLE REGISTRATION " +
                    "(id INTEGER not NULL, " +
                    " first VARCHAR(255), " +
                    " last VARCHAR(255), " +
                    " age INTEGER, " +
                    " PRIMARY KEY ( id ))";;
            stmt.executeUpdate(sql);
            System.out.println("Table created successfully...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
