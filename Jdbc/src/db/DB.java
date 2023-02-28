package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

    
    // conectar o banco

    private static Connection conn = null;

    // metodo para conectar o banco de dados

    public static Connection getConnection() {
        if (conn == null) {
            try {
                Properties props = loadProperties();
                String url = props.getProperty("dburl");
                // para obter a conexão com o BD
                conn = DriverManager.getConnection(url, props);
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }

        return conn;
    }

    // Metodo para fechar a conexão com o BD

    public static void closeConnection() {
        if (conn != null) {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }

        }
    }

    /// metodo auxilar para carregar as propriedades que estao salvos no
    /// db.properties
    private static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("db.properties")) {
            Properties props = new Properties();
            props.load(fs);
            return props;

        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }
}
