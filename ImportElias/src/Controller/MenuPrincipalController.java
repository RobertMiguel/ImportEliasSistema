/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import view.Agenda;
import view.Cadastro;
import view.MenuPrincipal;

/**
 *
 * @author rober
 */
public class MenuPrincipalController {
    
    private final MenuPrincipal view;


    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    
    public void navegarParaAgenda(){
    
       Agenda agenda = new Agenda();
       agenda.setVisible(true);
    
    }
    
    public void navegarParaCadastro(){
        Cadastro cadastro = new Cadastro();
        cadastro.setVisible(true);
    }    
     
}
   
