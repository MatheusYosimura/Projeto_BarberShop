/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.Date;
/**
 *
 * @author lym
 */
public class Cliente extends Pessoa{
    private String endereco;
    private String cep;
    
    public Cliente(int id, String nome, char sexo, String telefone, String endereco) {
        super(id, nome, sexo, telefone);
        this.endereco = endereco;
    }

    public Cliente(int id, String nome, char sexo, String dataNasc, String telefone, String email, String rg, String endereco, String cep) {
        super(id, nome, sexo, dataNasc, telefone, email, rg);
        this.endereco = endereco;
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    
}
