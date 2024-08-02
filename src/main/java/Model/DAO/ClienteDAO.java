/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Model.Cliente;
import java.util.ArrayList;

/**
 *
 * @author lym
 */
public class ClienteDAO {
    
    public ClienteDAO(){
    }
    
    public void insereCliente(Cliente cliente){
        BancoDAO.listaCliente.add(cliente);
    }
    
    public Cliente selectIDNome(Cliente cli){
        Cliente cliente = null; 
        for(Cliente test : BancoDAO.listaCliente){
            if(test.getNome().equals(cli.getNome()) && test.getId()==cli.getId()){
                cliente = test;
                break;
            }
        }
        return cliente;
    }
    
    public ArrayList<Cliente> selectAll(){
        return BancoDAO.listaCliente;
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
    public boolean deletaCliente (Cliente cli){
          for(Cliente test : BancoDAO.listaCliente){
            if(test == cli){
                BancoDAO.listaCliente.remove(cli);
                return true;
            }
        }
          return false;
    }
    
    public boolean atualizaCliente(Cliente cli){
        for(Cliente test : BancoDAO.listaCliente){
            if(test.getId() == cli.getId()){
                BancoDAO.listaCliente.set(BancoDAO.listaCliente.indexOf(test),cli);
                return true;
            }
        }
        return false;
    }
}
