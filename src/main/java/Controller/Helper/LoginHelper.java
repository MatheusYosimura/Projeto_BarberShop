/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;
import View.Login;
import Model.Usuario;
/**
 *
 * @author lym
 */
public class LoginHelper {
    private final Login view;
    
    public LoginHelper(Login view){
        this.view = view;
    }
    
    public Usuario getUsuario(){
        String nome = view.getjTextField_Username().getText();
        String senha = view.getjPasswordField_Password().getText();
        Usuario usr = new Usuario(0,nome,senha);
        return usr;
    }
    
    public void setUsuario(Usuario usr){
        String nome = usr.getNome();
        String senha = usr.getSenha();
        view.getjTextField_Username().setText(nome);
        view.getjPasswordField_Password().setText(senha);
    }
    
    public void limpaTela(){
        view.getjTextField_Username().setText("");
        view.getjPasswordField_Password().setText("");
    }
    
}
