import java.sql.*;

public class DBConnect {
    public static void main(String[] args) {
String url = "jdbc:sqlserver://localhost:1433;databaseName=FYP;integratedSecurity=true;encrypt=true;trustServerCertificate=true";

        try (Connection conn = DriverManager.getConnection(url)) {
            System.out.println("✅ Connected to SQL Server!");

            String sql = "SELECT * FROM users";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("User ID: " + id + ", Name: " + name);
            }

        } catch (SQLException e) {
            System.out.println("❌ Connection or Query failed:");
            e.printStackTrace();
        }
    }
}
