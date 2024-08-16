/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Agenda;
import Controller.Helper.AgendaHelper;
import Model.DAO.AgendamentoDAO;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import ServicoEmail.Correios;
import java.util.ArrayList;

/**
 *
 * @author lym
 */
public class AgendaController {
    private final Agenda view;
    private final AgendaHelper helper;
    
    
    public AgendaController(Agenda view){
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizaTabela(){
        //Busca lista no banco de dados
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        //Exibe lista na view
        helper.preencherTabela(agendamentos);
    }
        
    public void atualizaCliente(){
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> lista = clienteDAO.selectAll();
        helper.preencheCliente(lista);
    }
    
    public void atualizaServiço(){
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> lista = servicoDAO.selectAll();
        helper.preencheServico(lista);
    }
    
    public void atualizaValor(){
        Servico servico = helper.obtemServico();
        helper.atualizaValor(servico);
    }

    public void agendar() {
        Agendamento agendamento = helper.getModel();
        helper.limpaTela();
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        agendamentoDAO.insereAgendamento(agendamento);
        this.atualizaTabela();
        Correios.enviar(agendamento);
    }
}
