/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login.model.controller;


import java.sql.Connection;
import cadastro.CadastroView;
import java.sql.SQLException;
import login.LoginView;
import login.model.dao.LoginDAO;
import login.model.dao.conexao;


/**
 *
 * @author kaiky
 */
public class LoginController {
    
    
    public void cadastroUsuario(CadastroView view) throws SQLException{
    Connection conexao = (Connection) new conexao().getConnection();
    LoginDAO cadastro = new LoginDAO();
    cadastro.CadastrarUsuario(view.getjTextField1Nome().getText(), view.getjTextField6Email().getText(), view.getjPasswordField1Senha().getText());
        
        
        
    }

    public void loginUsuario(LoginView view) throws SQLException{
        Connection conexao = new conexao().getConnection();
        LoginDAO login= new LoginDAO();
         login.login(view.getjTextFieldLogin().getText(), view.getjPasswordFieldSenha().getText());
    }
}
