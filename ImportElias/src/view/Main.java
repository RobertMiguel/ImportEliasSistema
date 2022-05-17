/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author rober
 */
public class Main {
    public static void main(String[] args) {
        
        Servico servico = new Servico(0, 0);
        
        System.out.println(servico.getValor());
        
        Cliente cliente = new Cliente(1, "robert", "rua teste", "12345");
        System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario(1, "robert", "12345");
        System.out.println(usuario.getNome());
        
        Agendamento agendamento = new Agendamento(0, cliente, servico, 1, "08/05/2022 09:40");
        System.out.println(agendamento.getCliente().getNome());
        
    }
}
