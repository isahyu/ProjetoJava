/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Pessoa;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author Windows 10
 */
public class Main {
    
    
   public static void main(String[] args){
   
       String nome = "Lucas";
       System.out.println(nome);
       
       Servico servico = new Servico(1, "tattoo", 100);
       System.out.println(servico.getDescricao());
       System.out.println(servico.getValor());
       
       Cliente cliente = new Cliente("rua teste", "86600278", 1, "Sekitani Alice");
       System.out.println(cliente.getNome());
       
       Usuario usuario = new Usuario(1, "Lucas", "senha");
       System.out.println(usuario.getNome());
       
       
       Agendamento agendamento = new Agendamento(1, cliente, servico, 100, "06/10/2050 09:15");
       System.out.println(agendamento.getCliente().getNome());
       
       
     
   }
}
