import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws Exception {
        String host = System.getenv().getOrDefault("DB_HOST", "mysql-db");
        String database = System.getenv().getOrDefault("MYSQL_DATABASE", "demo");
        String user = System.getenv().getOrDefault("MYSQL_USER", "demo");
        String password = System.getenv().getOrDefault("MYSQL_PASSWORD", "demo123");
        String url = "jdbc:mysql://" + host + ":3306/" + database + "?connectTimeout=5000";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();
             ResultSet result = statement.executeQuery("SELECT 'Hello from MySQL' AS message")) {
            while (result.next()) {
                System.out.println(result.getString("message"));
            }
        }
    }
}
