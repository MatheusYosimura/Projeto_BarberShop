/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Agenda;
import View.TelaInicial;

/**
 *
 * @author lym
 */
public class TelaInicialController {
    private final TelaInicial view;
    
    public TelaInicialController(TelaInicial view){
        this.view = view;
    }
    
    public void moverAbaAgenda(){
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
        view.dispose();
    }
        
}
