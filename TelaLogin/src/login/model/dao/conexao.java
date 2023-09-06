/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kaiky
 */
public class conexao {
    
    
    public Connection getConnection() throws SQLException{
        Connection conexao = (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/aplication", "postgres", "postgres");
        return conexao;
    }
}
