/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServicoEmail;

import Model.Agendamento;

/**
 *
 * @author lym
 */
public class Correios {
    public static void enviar(Agendamento agendamento){
        String destinatario = agendamento.getCliente().getEmail(); 
        String mensagem = emailFormatado(agendamento);
        Email email = new Email(destinatario, "Agendamento BarberShop", mensagem);
        email.enviar();
    }

    private static String emailFormatado(Agendamento agendamento) {
        String nome = agendamento.getCliente().getNome();
        String descricao = agendamento.getServico().getDescricao();
        String data = agendamento.getDataFormatada();
        String hora = agendamento.getHoraFormatada();
        float valor = agendamento.getValor();
        
      return "Olá "+nome+
              "\nSeu agendamento para "+descricao+" está marcado para o dia "+data+" às "+hora+
              "\nValor: "+String.format("%.2f",valor)+
              "\nObrigado pela atenção e esperamos você ansiosamente.";
    }
}
