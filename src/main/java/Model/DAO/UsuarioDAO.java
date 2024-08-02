/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;
import Model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author lym
 */
public class UsuarioDAO {
    
    public UsuarioDAO(){
    }
    
    public void insereUsuario(Usuario usuario){
        BancoDAO.listaUsuario.add(usuario);
    }
    
    public Usuario selectNomeSenha(Usuario usr){
        Usuario user = null; 
        for(Usuario test : BancoDAO.listaUsuario){
            if(test.getNome().equals(usr.getNome()) && test.getSenha().equals(usr.getSenha())){
                user = test;
                break;
            }
        }
        return user;
    }
    
    public ArrayList<Usuario> selectAll(){
        return BancoDAO.listaUsuario;
    }
    
    //Utiliza o ID para comparar os usuários
    /*public boolean deletaUsuario (Usuario usr){
          for(Usuario test : BancoDAO.listaUsuario){
            if(test.getId() == usr.getId()){
                BancoDAO.listaUsuario.remove(usr);
                return true;
            }
        }
          return false;
    }*/
    //Utilizando a variável de referência para comparar os usuários
    public boolean deletaUsuario (Usuario usr){
          for(Usuario test : BancoDAO.listaUsuario){
            if(test == usr){
                BancoDAO.listaUsuario.remove(usr);
                return true;
            }
        }
          return false;
    }
    
    public boolean atualizaUsuario(Usuario usr){
        for(Usuario test : BancoDAO.listaUsuario){
            if(test.getId() == usr.getId()){
                BancoDAO.listaUsuario.set(BancoDAO.listaUsuario.indexOf(test),usr);
                return true;
            }
        }
        return false;
    }
}
