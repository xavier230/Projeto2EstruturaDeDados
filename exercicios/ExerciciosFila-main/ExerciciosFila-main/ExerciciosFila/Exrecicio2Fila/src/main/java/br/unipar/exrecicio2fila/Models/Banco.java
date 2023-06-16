/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.exrecicio2fila.Models;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author renat
 */
public class Banco {
    private Queue<Cliente> filaPrioritaria;
    private Queue<Cliente> filaNormal;
    private int contadorPrioritarios;

    public Banco() {
        filaPrioritaria = new LinkedList<>();
        filaNormal = new LinkedList<>();
        contadorPrioritarios = 0;
    }

    public void adCliente(Cliente cliente) {
        if (cliente.isPrioritario()) {
            filaPrioritaria.add(cliente);
        } else {
            filaNormal.add(cliente);
        }
    }

    public void pCliente() {
        if (!filaPrioritaria.isEmpty()) {
            if (contadorPrioritarios < 2) {
                Cliente proximoCliente = filaPrioritaria.poll();
                JOptionPane.showMessageDialog(null, 
                        "Próximo cliente prioritário: " + proximoCliente);
                contadorPrioritarios++;
            } else if (!filaNormal.isEmpty()) {
                Cliente proximoCliente = filaNormal.poll();
                JOptionPane.showMessageDialog(null, 
                        "Próximo cliente normal: " + proximoCliente);
                contadorPrioritarios = 0;
            } else {
                Cliente proximoCliente = filaPrioritaria.poll();
                JOptionPane.showMessageDialog(null,
                        "Próximo cliente prioritário: " + proximoCliente);
                contadorPrioritarios = 1;
            }
        } else if (!filaNormal.isEmpty()) {
            Cliente proximoCliente = filaNormal.poll();
            JOptionPane.showMessageDialog(null, 
                    "Próximo cliente normal: " + proximoCliente);
            contadorPrioritarios = 0;
        } else {
            JOptionPane.showMessageDialog(null, 
                    "Não há clientes na fila.");
        }
    }
}
