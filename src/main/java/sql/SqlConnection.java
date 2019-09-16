package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface SqlConnection {
    static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(Constants.URL, Constants.USER, Constants.PASSWORD);
    }
}
