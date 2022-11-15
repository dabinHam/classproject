package com.first.app.util;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;

public class ConnectionUtil {

    // POOL : 데이터베이스 연결정보를 가지고 설정값에 따라 connection 객체를 생성해서 가지고 관리
    private HikariDataSource ds;

    private static  ConnectionUtil instance = new ConnectionUtil();

    private ConnectionUtil(){       // private를 붙혀줌으로써 외부에서 ConnectionUtil이라고 생성할 수 있게 처리해주기.

        HikariConfig config = new HikariConfig();        // 기본생성자

        // JDBC 연결
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        config.setJdbcUrl("jdbc:mysql://localhost:3306/project");
        config.setUsername("scott");
        config.setPassword("tiger");
        // 추가 부수적인 설정
        config.addDataSourceProperty("cachePrepStmts",true);
        config.addDataSourceProperty("prepStmtCacheSize",250);
        config.addDataSourceProperty("prepStmtCacheSqlLimit",2048);

        ds = new HikariDataSource(config);

    }

    public static ConnectionUtil getInstance(){
        return instance;
    }

    public Connection getConnection() throws Exception{
        return ds.getConnection();
    }

}
//jdbcUrl=jdbc:mysql://localhost:3306/simpsons
//        username=test
//        password=test


//        아래 3가지는 기본 설정 으로 직접 할 수 있어야 한다. (간단한 테스트가 가능하게 해준다)
//        dataSource.cachePrepStmts=true
//        dataSource.prepStmtCacheSize=250            //
//        dataSource.prepStmtCacheSqlLimit=2048       // sql을 몇개나 쓸 수 있게 해주느냐



//        dataSource.useServerPrepStmts=true
//        dataSource.useLocalSessionState=true
//        dataSource.rewriteBatchedStatements=true
//        dataSource.cacheResultSetMetadata=true
//        dataSource.cacheServerConfiguration=true
//        dataSource.elideSetAutoCommits=true
//        dataSource.maintainTimeStats=false