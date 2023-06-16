/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.exercicio1fila;

import br.unipar.exercicio1fila.Models.FilaClinica;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import javax.swing.JOptionPane;



/**
 *
 * @author renat
 */
public class Main {

    public static void main(String[] args) {
       

         Integer option = -1;

        FilaClinica filaClinica = new FilaClinica();

        do{ 
           option = Integer.parseInt(JOptionPane.showInputDialog("----- Menu -----\n" +
                    "1 - Adicionar paciente\n" +
                    "2 - Chamar próximo paciente\n" +
                    "0 - Sair\n\n" +
                    "Escolha uma opção:"));

            
            

            switch (option) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Informe o nome do paciente:");
                    filaClinica.adicionarPaciente(nome);
                    break;
                case 2:
                    filaClinica.chamarProximoPaciente();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Você escolheu sair");
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Escolha novamente.");
                    break;
            }
        } while (!option.equals(0));
    }
}


