package com.levelUp.homework.dao;


import java.sql.*;


/**
 * Created by Sawa on 24.05.2017.
 */
public class DBConnector {
    private static DBConnector instance;

    public static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    public static final String USER = "test_user";
    public static final String PASSWORD = "yxo";

    private DBConnector() throws SQLException {
        DriverManager.registerDriver(new org.postgresql.Driver());
    }

    public static DBConnector getInstance() throws SQLException {
        if (instance == null) {
            instance = new DBConnector();
        }
        return instance;
    }
    public Connection getPostgresConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }



    public static void closeConnections(Wrapper... wrappers) {
        for (Wrapper wrapper : wrappers) {
            if (wrapper instanceof Connection && wrapper != null) {
                Connection conn = (Connection) wrapper;
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else if (wrapper instanceof Statement && wrapper != null) {
                Statement statement = (Statement) wrapper;
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else if (wrapper instanceof ResultSet && wrapper != null) {
                ResultSet resultSet = (ResultSet) wrapper;
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
