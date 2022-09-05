/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class Banco {
    
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Cliente> cliente;
    public static ArrayList<Servico> servico;
    public static ArrayList<Agendamento> agendamento;
    
    
    public static void inicia(){
    
        //Instancia os Objetos
        usuario = new ArrayList<Usuario>();
        cliente = new ArrayList<Cliente>();
        servico = new ArrayList<Servico>();
        agendamento = new ArrayList<Agendamento>();
        
        //criando elementos
        Usuario usuario1 = new Usuario(1, "Yuri", "12345");
        Usuario usuario2 = new Usuario(2, "Elias", "12345");
        Usuario usuario3 = new Usuario(3, "Robert","12345");
        
         
        Cliente cliente1 = new Cliente("Rua Almirante Tamandaré", "63700-977", 1, "Yuri", 'M', "27/06/2005", "92182738", "yuri@gmail.com", "38.405.625-8");
        Cliente cliente2 = new Cliente("Rua Barão do Rio Branco", "63700-970", 2, "Elias", 'M', "11/07/2005", "96215583", "elias@gmail.com", "24.269.370-2");
        Cliente cliente3 = new Cliente("Rua João Soares", "63700-000", 3, "Robert", 'M', "21/03/2006", "93761551", "robertresende9@gmail.com", "23.669.827-8");

        Servico servico1 = new Servico(1, 100000);
        Servico servico2 = new Servico(2, 200000);
        Servico servico3 = new Servico(3, 300000);
           
        Agendamento agendamento1 = new Agendamento(1, cliente1, servico1, 100000, "14/07/2018 09:30");
        Agendamento agendamento2 = new Agendamento(2, cliente2, servico2, 200000, "14/07/2018 10:00");
        Agendamento agendamento3 = new Agendamento(3, cliente3, servico3, 300000, "14/07/2018 10:30");
        
        
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        cliente.add(cliente1);
        servico.add(servico1);
        agendamento.add(agendamento1);
        
        usuario.add(usuario2);
        cliente.add(cliente2);
        servico.add(servico2);
        agendamento.add(agendamento2);
        
        usuario.add(usuario3);
        cliente.add(cliente3);
        servico.add(servico3);
        agendamento.add(agendamento3);
        
        
    }
    
    
}
