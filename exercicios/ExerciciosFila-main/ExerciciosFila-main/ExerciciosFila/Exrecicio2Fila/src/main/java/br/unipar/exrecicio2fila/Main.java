/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.exrecicio2fila;

/**
 *
 * @author renat
 */
import br.unipar.exrecicio2fila.Models.Banco;
import br.unipar.exrecicio2fila.Models.Cliente;
import javax.swing.JOptionPane;



public class Main {

    public static void main(String[] args) {
       Banco banco = new Banco();
        Integer option = -1;
        do{ 
           option = Integer.parseInt(JOptionPane.showInputDialog(
                   "----- Menu -----\n" +
                    "1 - Adicionar cliente\n" +
                    "2 - Chamar cliente\n" +
                    "0 - Sair\n\n" +
                    "Escolha uma opção:"));

         

            switch (option) {
                case 1:
                    String nome = JOptionPane.showInputDialog(
                            "Informe o nome do cliente:");
                    int anoNascimento = Integer.parseInt(
                            JOptionPane.showInputDialog(
                      "Informe o ano de nascimento do cliente:"));
                    Cliente cliente = new Cliente(nome, anoNascimento);
                    banco.adCliente(cliente);
                    break;
                case 2:
                    banco.pCliente();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, 
                            "Você escolheu sair");
                default:
                    JOptionPane.showMessageDialog(null, 
                            "Opção inválida. Escolha novamente.");
                    break;
            }
        }while (!option.equals(0));
    }
}

