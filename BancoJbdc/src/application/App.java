package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class App {
    public static void main(String[] args) throws SQLException {


       
        // conectando o banco
        Connection conn = null;

      //fazendo consulta para retonar todos departamentos do banco de dados
        Statement st =null;

         // guardando a variavel da consulta
        ResultSet rs = null;
 

        
        try {
            conn = DB.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("select * from department");
        
        while (rs.next()){
            System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
        }
        
        } catch (SQLException e) {
            e.printStackTrace();
        }

        finally{
            DB.closeResultSet(rs);
            DB.closeStatement(null);
            DB.closeConnection();
        }
    }
}
