package hu.unideb.inf.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConn {
    public Connection databaseLink;

    public Connection getConnection() {

        //java.sql.Connection conn = null;

        String databaseName = "bpr";
        String databaseUser = "root";
        String databasePassword  = "123456789a";
        String url = "jdbc:mysql://localhost/" + databaseName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);
            System.out.println("Sikeres kapcsolat");


        }catch(Exception e) {
            System.out.println("Sikertelen kapcsolat");
            e.printStackTrace();
            e.getCause();
        }

        return databaseLink;
    }
}