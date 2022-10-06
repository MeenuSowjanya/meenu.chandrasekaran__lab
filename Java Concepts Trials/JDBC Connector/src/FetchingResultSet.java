import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.lang.Throwable.*;

public class FetchingResultSet {
    public static void viewTable(Connection con) throws SQLException {
        String query = "select id, first, last, age from REGISTRATION";
        try (Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {

                int id = rs.getInt("id");
                String first = rs.getString("first");
                String last = rs.getString("last");
                int age = rs.getInt("age");
                System.out.println(id + ", " + first + ", " + last +
                        ", " + age);
            }
        } catch (SQLException e) {
            System.out.println("Cannot fetch the resultset");
        }
    }
}
