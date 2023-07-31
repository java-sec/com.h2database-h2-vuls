package cc11001100.com.h2database.vuls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * 在连接的时候执行SQL
 *
 * @author CC11001100
 */
public class ExecuteSqlOnConnectionExample {

    private static final String DRIVER_CLASS = "org.h2.Driver";

    static {
        try {
            Class.forName(DRIVER_CLASS);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection createConnection(String jdbcURL) {
        try {
            return DriverManager.getConnection(jdbcURL);
        } catch (SQLException e) {
            return null;
        }
    }

    public static void main(String[] args) throws SQLException, InterruptedException {

        String jdbcURL = "jdbc:h2:mem:test;INIT=runscript from 'classpath:~/create.sql'\\;runscript from 'classpath:~/init.sql'";
        createConnection(jdbcURL);

        // 文档：
        // http://www.h2database.com/html/features.html?highlight=init&search=init#execute_sql_on_connection

    }

}
