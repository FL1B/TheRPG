import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyJDBC {

    public static void main(String[] args) {


        try {

            Connection connection = DriverManager.getConnection(
                    "JDBC:mysql://localhost:3306/therpg",
                    "root",
                    "Rfgqxscllboxu");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from droptable");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("itemName"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
