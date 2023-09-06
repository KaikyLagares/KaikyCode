/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login.model.dao;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
/**
 *
 * @author kaiky
 */
public class LoginDAO {
    
    public void CadastrarUsuario(String nome, String email, String senha) throws SQLException{
        Connection conexao = new conexao().getConnection();
        String sql = "INSERT INTO  login (nome, email,senha) VALUES ('"+nome+"','"+email+"','"+senha+"' );";
        System.out.println(sql);
        PreparedStatement statment = conexao.prepareStatement(sql);
        statment.execute();
        conexao.close();
    }
    public void login (String email, String senha) throws SQLException{
        Connection conexao = new conexao().getConnection();
        String sql = "select email,senha  from login where email = '"+email+"'and senha'"+senha+"' ;";
        System.out.println(sql);
        PreparedStatement statment = conexao.prepareStatement(sql);
        ResultSet rs = statment.executeQuery();
        
        if(rs.next()){
            System.out.println("Possui");  
        }else{
            System.out.println("Nao possui");
            
        }
        conexao.close();
    }
    
    
    
}
