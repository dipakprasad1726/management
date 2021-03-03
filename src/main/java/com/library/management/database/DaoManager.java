package com.library.management.database;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class DaoManager {

  public Connection databaseConnector() throws SQLException {
    Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/library",
        "root", "12345");
    return con;
  }

}
