package cc11001100.com.h2database.vuls;

import org.h2.tools.Server;

import java.sql.SQLException;

/**
 * 启动一个h2的web server
 *
 * @author CC11001100
 */
public class WebServerExample {

    public static void main(String[] args) throws SQLException {

        Server webServer = Server.createWebServer();
        webServer.start();

        // 现在浏览器访问 http://localhost:8082/ 可以用来连接数据库，比如通过 jdbc:h2:tcp://localhost/~/test 连接到tcp server

    }

}
