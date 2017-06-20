package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by admin on 2017/6/20.
 */
public class DBUtil {
    private static String ip = "127.0.0.1";
    private static String database = "mxybill";
    private static String encoding = "UTF-8";
    private static String loginName = "root";
    private static String password = "admin";
    private static int port = 3306;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException{
        String url = String.format("jdbc:mysql://%s:%d/%s?characterEncoding=%s&useSSL=true", ip, port, database, encoding);
        return DriverManager.getConnection(url,loginName,password);
    }
}
