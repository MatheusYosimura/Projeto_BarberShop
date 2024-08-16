/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServicoEmail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;
/**
 *
 * @author lym
 */
public class Email {
    //Insira seu email de envio
    static final String origem = "******";
    //Insira sua senha do email de envio
    static final String senha = "********";
    private String destinatario;
    private String assunto;
    private String mensagem;
    
    public Email (String destino, String assunto, String mensagem){
        this.destinatario = destino;
        this.assunto = assunto;
        this.mensagem = mensagem;
    }
    
    public void enviar(){
        SimpleEmail email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator(origem,senha));
        email.setSSLOnConnect(true);
        
        try{
            email.setFrom(origem);
            email.setSubject(assunto);
            email.setMsg(mensagem);
            email.addTo(destinatario);
            email.send();
            System.out.println("Email Enviado");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
