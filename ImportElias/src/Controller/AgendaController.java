/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.DAO.AgendamentoDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import view.Agenda;

/**
 *
 * @author rober
 */
public class AgendaController {
    
    private final Agenda view;
    private final AgendaHelper helper;
    private ArrayList<Agendamento> agendamentos;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
   public void atualizarTabela(){
      // AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
      //ArrayList <Agendamento> agendamentos = agendamentoDAO.selectAll();
      //helper.preencherTabela(agendamentos);
   }
  
               
}
