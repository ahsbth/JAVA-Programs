import java.sql.*;

public class CreateEmployeeTable {

    public static void main(String[] args) throws SQLException {

        // Get a connection to the database
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "");

        // Create a statement object
        Statement statement = connection.createStatement();

        // Create the table
        String sql = "CREATE TABLE employees (id INT NOT NULL AUTO_INCREMENT, name VARCHAR(255), designation VARCHAR(255), experience INT, age INT, PRIMARY KEY (id));";
        statement.executeUpdate(sql);

        // Close the connection
        connection.close();
    }
}

