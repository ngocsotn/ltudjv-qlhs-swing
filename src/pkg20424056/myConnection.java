/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20424056;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author NGOC
 */
public class myConnection {
    public static Connection conn = null;
    public static String typeCon = "sqlserver";
    public static String ConnectionString = "";
    private static String id = "";
    private static String pwd = "";
    
    public static void forceClose() throws SQLException
    {
        if(conn == null)
        {
            return;
        }
        if(conn.isClosed() == false)
        {
            conn.close();
            conn = null;
        }
    }
    
    public static Connection reConnect() throws SQLException
    {
        forceClose();
        conn = (Connection) DriverManager.getConnection(ConnectionString,
            id, pwd);

        return conn;
    }
    
    public static Connection getConnecttion(String sqlType, String IP, String port, String dbName, String username, String password) throws ClassNotFoundException, SQLException
    {
        id = username;
        pwd = password;
        forceClose();
        try {
            ConnectionString =
            "jdbc:" + 
            sqlType +
            "://" +
            IP +
            ":" +
            port;
            
            if(sqlType.equals("mysql"))
            {
                Class.forName("com.mysql.jdbc.Connection");
                typeCon = "mysql";
                ConnectionString += "/" + dbName + "?useUnicode=yes&characterEncoding=UTF-8";
            }
            else if(sqlType.equals("sqlserver"))
            {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                typeCon = "sqlserver";
                ConnectionString += ";" + "databaseName=" + dbName+";useUnicode=yes&characterEncoding=UTF-8";
            }
            else if(sqlType.equals("oracle"))
            {
                Class.forName("oracle.jdbc.driver.OracleDriver"); 
                typeCon = "oracle";
                ConnectionString = "jdbc:oracle:thin:@" + IP + ":" + port + ":" + dbName;
            }
            
//            System.out.println(ConnectionString);
            conn = (Connection) DriverManager.getConnection(ConnectionString,
            username, password);
            } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
