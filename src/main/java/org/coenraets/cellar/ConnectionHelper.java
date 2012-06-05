package org.coenraets.cellar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.io.IOUtils;

public class ConnectionHelper {
    private String url;
    private static ConnectionHelper instance;

    private ConnectionHelper() {
        url = "jdbc:h2:mem:db1";

        try {
            Connection c = DriverManager.getConnection(url);
            Statement st = c.createStatement();
            String s = IOUtils.toString(getClass().getResourceAsStream(
                    "db/h2/cellar.sql"));
            String[] inst = s.split(";");

            for (String sx : inst) {
                if (!sx.trim().equals("")) {
                    st.executeUpdate(sx);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Connection getConnection() throws SQLException {
        if (instance == null) {
            instance = new ConnectionHelper();
        }
        try {
            return DriverManager.getConnection(instance.url);
        } catch (SQLException e) {
            throw e;
        }
    }

    public static void close(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}