/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Model.Servico;
import java.util.ArrayList;
/**
 *
 * @author lym
 */
public class ServicoDAO {
    
    public ServicoDAO(){
    }
    
    public void insereServico(Servico svc){
        BancoDAO.listaServico.add(svc);
    }
    
    public ArrayList<Servico> selectAll(){
        return BancoDAO.listaServico;
    }
    
    public boolean deletaServico(Servico src){
        for(Servico teste : BancoDAO.listaServico){
            if(teste == src){
                BancoDAO.listaServico.remove(teste);
                return true;
            }
        }
        return false;
    }
    
    public boolean atualizaServico(Servico svc){
        for(Servico teste : BancoDAO.listaServico){
            if(teste.getId() == svc.getId()){
                BancoDAO.listaServico.set(BancoDAO.listaServico.indexOf(teste), svc);
                return true;
            }
        }
        return false;
    }
}
