/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import view.FormRegistro;
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
    
       FormRegistro formRegistro = new FormRegistro();
       formRegistro.setVisible(true);
    
    }
       
     
}
   
