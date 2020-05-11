package singleton_pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static Logger logger = LoggerFactory.getLogger(DatabaseConnection.class);
    private static DatabaseConnection databaseConnection;
    private Connection connection;

    /**
     * Constructor need to be private
     * it will help to restrict more object creation
     * connection should crete inside the constructor
     * used reflections to bypass the access modifier restrictions
     */
    private DatabaseConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String password = "ruwan_liyanage";
            String username = "ruwan";
            String hostUrl = "jdbc:mysql://localhost:3306/course_management_system";
            this.connection = DriverManager.getConnection(hostUrl, username, password);
            logger.info("Database Connection Creation successfully");
        } catch (ClassNotFoundException e) {
            String message = "Check JDBC connection";
            logger.error(message, e);
        } catch (SQLException e) {
            String message = "Check host, username, password in MySQL connection";
            logger.error(message, e);
        }
    }

    /**
     * There is a way to get The connection without creating a new object
     *
     * @return Connection
     */
    public Connection getConnection() {
        return this.connection;
    }

    /**
     * This method will create the one and only instance for this class
     * and it will returns through a static method.
     * by using static method can perform the task without creating an instance
     * If using multi-threading, can use to "synchronized" keyword to thread safety.
     * but if there are no multi-threading, no need to use "synchronized" keyword
     * instance creation can happen when it null and when connection closed.
     * we created the connection inside the constructor, hence we need to call the constructor to create the connection again
     * but we used private constructor in here.
     *
     * @return database connection object.
     * @throws SQLException when connection closing.
     */

    public static synchronized DatabaseConnection getDatabaseConnection() throws SQLException {
        if (databaseConnection == null) {
            databaseConnection = new DatabaseConnection();
        } else if (databaseConnection.connection.isClosed()) {
            databaseConnection = new DatabaseConnection();
        }
        return databaseConnection;
    }
}
