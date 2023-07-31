package cc11001100.com.h2database.vuls;

import org.h2.tools.Server;

import java.sql.SQLException;

/**
 * 启动一个h2的tcp server
 *
 * @author CC11001100
 */
public class TcpServerExample {

    public static void main(String[] args) throws SQLException {

        Server tcpServer = Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "8043");
        tcpServer.start();

        // 启动成功后可以通过：
        // jdbc:h2:tcp://localhost:8043/~/test
        // 这种格式来连接

    }

}
