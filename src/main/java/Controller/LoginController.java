/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Controller.Helper.LoginHelper;
import View.Login;
import Model.*;
import Model.DAO.UsuarioDAO;
import View.TelaInicial;
import javax.swing.JOptionPane;
/**
 *
 * @author lym
 */
public class LoginController {
    private final Login view;
    private final LoginHelper helper;
    
    public LoginController (Login view){
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void botaoApertado(){
        Usuario usr = helper.getModel();
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario teste = usuarioDAO.selectNomeSenha(usr);
        if(teste!=null){
            TelaInicial telaInicial = new TelaInicial();
            telaInicial.setVisible(true);
            this.view.dispose();
        }else{
            view.exibeMensagem("Usuário ou Senha incorretos");
            helper.limpaTela();
        }
    }
}
