/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Model.*;
import java.util.ArrayList;

/**
 *
 * @author lym
 */
public class DAOTester {
    public static void main (String[] args0){
        BancoDAO.inicia();
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        ClienteDAO clienteDAO = new ClienteDAO();
        
        /*----------------------------------------------------
         *   UsuarioDAO
         *----------------------------------------------------*/
        //Teste 1 = Testando selectNomeSenha
        Usuario teste1 = usuarioDAO.selectNomeSenha(new Usuario(0,"barbeiro","barbeiro123"));
        if(teste1 != null){
            System.out.println("===Teste1===\nUsuário Encontrato\n===========");
        }
        
        //Teste 2 = Testando deletaUsuario
        Usuario teste2 = usuarioDAO.selectNomeSenha(new Usuario(0,"barbeiro","barbeiro123"));
        if(teste2 != null){
            if(usuarioDAO.deletaUsuario(teste2)){
                if(usuarioDAO.selectNomeSenha(new Usuario(0,"barbeiro","barbeiro123")) == null){
                    System.out.println("===Teste2===\nUsuário Deletado\n===========");
                }
            }
        }
        
        //Teste 3 = Testando selectAll
        ArrayList<Usuario> teste3 = usuarioDAO.selectAll();
        if(teste3 == BancoDAO.listaUsuario){
            System.out.println("===Teste3===\nLista de Usuários retornada com sucesso");
            System.out.println(teste3+"\n===========");
        }
        
        //Teste 4 = Testando atualizaUsuario
        Usuario teste4 = BancoDAO.listaUsuario.get(0);
        //System.out.println(teste4.getNome());
        if(usuarioDAO.atualizaUsuario(new Usuario(1,"NovoNome","teste"))){
            System.out.println("===Teste4===\nUsuario atualizado com sucesso");
            System.out.println("Novo Nome: "+BancoDAO.listaUsuario.get(0).getNome());
            System.out.println("Antigo Nome: "+teste4.getNome()+"\n===========");
        }
        
        /*----------------------------------------------------
         *   TesteDAO
         *----------------------------------------------------*/
        //Teste 5 = Testando selectIDNome
        Cliente teste5 = clienteDAO.selectIDNome(new Cliente(1,"Matheus",'M',"",""));
        if(teste5 != null){
            System.out.println("===Teste5===\nCliente Encontrato\n===========");
            //System.out.println(teste5.toString());
        }
        
        //Teste 6 = Testando deletaCliente
        if(clienteDAO.deletaCliente(teste5)){
            if(clienteDAO.selectIDNome(new Cliente(1,"Matheus",'M',"",""))==null){
                System.out.println("===Teste6===\nCliente Deletado\n===========");
            }
        }
        
        //Teste 7 = Testando selectAll
        ArrayList<Cliente> teste7 = clienteDAO.selectAll();
        if(teste7 == BancoDAO.listaCliente){
            System.out.println("===Teste7===\nLista de Clientes retornada com sucesso");
            System.out.println(teste7+"\n==========="); 
        }
        
        //Teste 8 = Testando atualizaCliente
        Cliente teste8 = BancoDAO.listaCliente.get(0);
        if(clienteDAO.atualizaCliente(new Cliente(teste8.getId(),"NovoNome",'X',"",""))){
            System.out.println("===Teste8===\nCliente atualizado com sucesso");
            System.out.println("Novo Nome: "+BancoDAO.listaCliente.get(0).getNome());
            System.out.println("Antigo Nome: "+teste8.getNome()+"\n===========");
        }
    }
}
