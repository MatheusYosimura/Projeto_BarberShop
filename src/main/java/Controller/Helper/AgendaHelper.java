/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import View.Agenda;
import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lym
 */
public class AgendaHelper implements IHelper{
    private final Agenda view;
    
    public AgendaHelper (Agenda view){
        this.view = view;
    }
    
    public void preencherTabela(ArrayList<Agendamento> lista){
        DefaultTableModel tableModel = (DefaultTableModel) view.getjTable_Tabela().getModel();
        tableModel.setNumRows(0);
        
        for(Agendamento agendamento : lista){
            tableModel.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getObservacao()
            });
        }
    }

    public void preencheCliente(ArrayList<Cliente> lista) {
        DefaultComboBoxModel comboBox = (DefaultComboBoxModel)view.getjComboBox_Cliente().getModel();
        for(Cliente cliente : lista){
            comboBox.addElement(cliente);
        }
    }

    public void preencheServico(ArrayList<Servico> lista) {
        DefaultComboBoxModel comboBox = (DefaultComboBoxModel)view.getjComboBox_Servico().getModel();
        for(Servico servico : lista){
            comboBox.addElement(servico);
        }
    }
    
    public Cliente obtemCliente() {
        return (Cliente)view.getjComboBox_Cliente().getSelectedItem();
    }
    
    public Servico obtemServico() {
        return (Servico)view.getjComboBox_Servico().getSelectedItem();
    }

    public void atualizaValor(Servico servico) {
        view.getjTextField_Valor().setText(""+servico.getValor());
    }

    @Override
    public Agendamento getModel() {
        int id = Integer.parseInt(view.getjTextField_ID().getText());
        Cliente cliente = this.obtemCliente();
        Servico servico = this.obtemServico();
        float valor = Float.parseFloat(view.getjTextField_Valor().getText());
        //2 Opções para Data e Hora 
        //1º = Concatenar a data e hora para o formato especificado no model.
        //2º = Criar variáveis para data e hora no model. 
        String data = view.getjTextField_Data().getText();
        String hora = view.getjTextField_Hora().getText();
        String dataHora = data.concat(" "+hora);
        String observacao = view.getjTextAreaObservacao().getText();
        /*view.exibeMensagem("ID: "+id+
                "\nCliente: "+cliente+
                "\nServiço: "+servico+
                "\nValor: "+valor+
                "\nData: "+data+
                "\nHora: "+hora+
                "\nData e Hora: "+dataHora+
                "\nObservação: "+observacao);
        */
        
        Agendamento agendamento = new Agendamento(id,cliente,servico,valor,dataHora,observacao);
        return agendamento;
    }

    @Override
    public void limpaTela() {      
        view.getjTextField_ID().setText("");
        view.getjTextField_Data().setText("");
        view.getjTextField_Hora().setText("");
        view.getjTextAreaObservacao().setText("");
    }
    
}
