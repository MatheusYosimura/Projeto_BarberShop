/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServicoEmail;
import ServicoEmail.Email;

/**
 *
 * @author lym
 */
public class EmailTeste {
    public static void main(String[] args){
        String destino = "matheuslimayosimura@gmail.com";
        String assunto = "Teste envio email Java";
        String mensagem = "Mensagem do email";

        Email novoEmail =  new Email(destino,assunto,mensagem);

        novoEmail.enviar();
    }
}
