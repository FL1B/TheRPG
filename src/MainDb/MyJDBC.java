package MainDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

public class MyJDBC {

    private static final String url = "jdbc:mysql://localhost:3306/therpg";
    private static final String username = "root";
    private static final String password = "Rfgqxscllboxu";
    public static Connection connection = null;

    public static Connection getConnection() {
        if (connection != null)
            return connection;
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database!");
        } catch (SQLException e) {
            System.out.println("Failed to connect to database");
            e.printStackTrace();
        }
        return connection;
// printer ut hele tabellen "droptable";
/*          ResultSet resultSet = statement.executeQuery("select * from droptable");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("itemName"));
            }
*/
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Connection closed");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

