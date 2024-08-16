/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Model.Agendamento;
import java.util.ArrayList;
/**
 *
 * @author lym
 */
public class AgendamentoDAO {
    
    public AgendamentoDAO(){
    }
    
    public void insereAgendamento(Agendamento agen){
        BancoDAO.listaAgendamento.add(agen);
    }
    
    public ArrayList<Agendamento> selectAll(){
        return BancoDAO.listaAgendamento;
    }
    
    public Agendamento selectId(int Id){
        Agendamento agendamento = null;
        for(Agendamento test : BancoDAO.listaAgendamento){
            if(test.getId() == Id){
                agendamento = test;
                break;
            }
        }
        return agendamento;
    }
    
    public boolean deletaAgendamento(Agendamento agen){
        for(Agendamento test : BancoDAO.listaAgendamento){
            if(test == agen){
                BancoDAO.listaAgendamento.remove(agen);
                return true;
            }
        }
        return false;
    }
    
    public boolean atualizaAgendamento(Agendamento agen){
        for(Agendamento test : BancoDAO.listaAgendamento){
            if(test.getId() == agen.getId()){
                BancoDAO.listaAgendamento.set(BancoDAO.listaAgendamento.indexOf(test),agen);
                return true;
            }
        }
        return false;
    }
}
