package com.first.app.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
//     Singletone pattern
//
//    private  Connection conn;
//
//    // 만들어서 사용할 수 있게 static 추가
//    private static ConnectionProvider instance = new ConnectionProvider();
//
//    private ConnectionProvider(){}
//
//    public  ConnectionProvider getInstance(){
//        return instance;
//    }

    public Connection getConnection() throws  Exception{    // 밖에서 처리하기 위하여 throws Exception

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/project",
                "scott",
                "tiger");

        return  conn;
    }

}
