/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.exercicio1fila.Models;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author renat
 */
public class FilaClinica {
    private Queue<String> fila;
    private static final int LIMITE_SENHAS = 20;

    public FilaClinica() {
        fila = new LinkedList<>();
    }

    public void adicionarPaciente(String nome) {
        if (fila.size() < LIMITE_SENHAS) {
            fila.add(nome);
            JOptionPane.showMessageDialog(null, "Paciente " + nome + " adicionado à fila.");
        } else {
            JOptionPane.showMessageDialog(null, "A fila está cheia. Não é possível adicionar mais pacientes.");
        }
    }

    public void chamarProximoPaciente() {
        if (!fila.isEmpty()) {
            String proximoPaciente = fila.poll();
            JOptionPane.showMessageDialog(null, "Próximo paciente: " + proximoPaciente);
        } else {
            JOptionPane.showMessageDialog(null, "Não há pacientes na fila.");
        }
    }
}