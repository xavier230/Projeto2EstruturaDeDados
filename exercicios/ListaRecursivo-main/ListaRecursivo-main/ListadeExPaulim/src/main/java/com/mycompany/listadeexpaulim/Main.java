/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listadeexpaulim;

import javax.swing.JOptionPane;

/**
 *
 * @author renat
 */
public class Main {

    public static void main(String[] args) {
        
      Integer option = -1;
      
              option = Integer.parseInt(JOptionPane.showInputDialog(
                      "Escolha um dos exercicios \n"
                      + "1 para Soma recursiva de 0 a 50\n"
                      + "2 Para Recursiva Fatorial\n "
                      + "3 Para Fibonacci"));
        if(option.equals(1)){
            int resultado = somar(0, 50);
        System.out.println("Resultado: " + resultado);  
        }else if (option.equals(2)){
           

      Integer numero = Integer.parseInt(JOptionPane.showInputDialog(
              "Informe um número inteiro não negativo: "));
     

        int resultado = calcFatorial(numero);

        System.out.println("O fatorial de " + numero + " é: " + resultado);
        
    }else if (option.equals(3)){
         
        
        Integer numero = Integer.parseInt(JOptionPane.showInputDialog(
                "Informe um número inteiro não negativo: "));
    

        System.out.println("Sequência Fibonacci de " + numero + ":");
        for (int i = 0; i <= numero; i++) {
            System.out.print(calcFibonacci(i) + " ");
        }
    }
}

    public static int calcFibonacci(int numero) {
        if (numero == 0) {
            return 0;
        } else if (numero == 1) {
            return 1;
        } else {
            return calcFibonacci(numero - 1) + calcFibonacci(numero - 2);
        }
    }
 


    public static int calcFatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * calcFatorial(numero - 1);
        }
        }
        
      
    

    public static int somar(int inicio, int fim) {
        if (inicio > fim) {
            return 0;
        } else {
            return inicio + somar(inicio + 1, fim);
        }
    }
}

