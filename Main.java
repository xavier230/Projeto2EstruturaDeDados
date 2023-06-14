/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unipar.sistemabancario;

import br.unipar.sistemabancario.models.Conta;
import javax.swing.JOptionPane;



/**
 *
 * @author renat
 */
public class Main {

  
    public static void main(String[] args) {
      double inicio = 0;
      int numContas
     = Integer.parseInt(JOptionPane.showInputDialog("Insira quantas Contas "
        + "Deseja Cadastrar"));
      Conta vetor[] = new Conta[numContas];

    

      for(int i = 0;i < vetor.length;i++){
        Conta c = new Conta();
        c.setId(i+1);
        c.setNome(JOptionPane.showInputDialog(
                "Insira o nome do Titular: \n"));
        
        c.setNumeroCont(Integer.parseInt(JOptionPane.showInputDialog(
                "Insira o numero da Conta : \n")));
        c.setSaldo(Double.parseDouble(JOptionPane.showInputDialog(""
                + "Insira o saldo inicial do cliente: \n")));
      
        JOptionPane.showMessageDialog(null, "Conta Cadastrada "
                + "com sucesso !");
        vetor[i] = c;
        c.saldoBancos();
     }
        Integer option = -1;
        String loop ="";
    do{
 

   option =  Integer.parseInt(JOptionPane.showInputDialog(
          "\n -----------------------MENU-----------------------\n"
                 +"     Escolha uma das opcões abaixo:             \n"
          +"[1] Ordenar contas por numeros da Conta; \n"
          +"[2] Ordenar contas por saldo da Conta; \n"
          +"[3] Realizar Deposito; \n"
          +"[4] Realizar Saque; \n"
          +"[5] Verificar saldo negativo; \n"
          +"[6] Verificar saldo Total; \n"
          +"[7] Imprimir todas contas cadastradas;"
          +"[0] Sair;\n "
           ));
   
   
   if(option.equals(1)){
     
        int ordena, j ;
        for(int i = 1; i<vetor.length; i++){
           Conta conta = vetor[i];
           ordena = conta.getNumeroCont();
           for(j = i - 1; (j>= 0 && vetor[j].getNumeroCont() > ordena); j--){
           vetor[j +1 ] = vetor[j];
           }
           vetor[j +1] = conta;

        }
        for(int ordena2 = 0; ordena2 < vetor.length; ordena2++){
        Conta conta = vetor[ordena2];
        JOptionPane.showMessageDialog(null,conta.toString()+"\n");

        }
      
   }
   else if(option.equals(2)){
        double ordena3;
                int j ;
          for(int i = 1; i<vetor.length; i++){
             Conta conta = vetor[i];
             ordena3 = conta.getSaldo();
             for(j = i - 1; (j>= 0 && vetor[j].getSaldo()> ordena3); j--){
             vetor[j +1 ] = vetor[j];
             }
             vetor[j +1] = conta;

          }
          for(int ordena4 = 0; ordena4 < vetor.length; ordena4++){
          Conta conta = vetor[ordena4];
          JOptionPane.showMessageDialog(null,conta.toString()+"\n");

          }
  

    }
   else if(option.equals(3)){
        Integer deposito = Integer.parseInt(JOptionPane.showInputDialog(
           "Escolha um meio de deposito \n e \n digite um numero da Opção"
       + "\n-------------------------------------------------------------\n"
                   + "1 = Numero Da Conta:\n"
                   + "2 = Nome Da Pessoa:\n"));
   
          if(deposito.equals(1)){
       
          int dep = Integer.parseInt(JOptionPane.showInputDialog("Insira o"
               + "numero da conta deseja realizar Deposito:\n"));
         double valor = Double.parseDouble(JOptionPane.showInputDialog(
               "Insira o valor que deseja depositar: \n"));
           for(int i = 0; i< vetor.length;i++){
           Conta conta= vetor[i];
           
           if(vetor[i].getNumeroCont() == deposito){
           
           vetor[i].setSaldoAtualizado(valor);
           
           conta.saldoBancos();
           }
       }
   }
   
   else if(deposito.equals(2)){
       
        String dep2 = JOptionPane.showInputDialog("Insira o nome da pessoa"
                + "que deseja realizar o Deposito:\n");
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog(
        "Insira o valor que deseja depositar:\n"));

        for(int i =0; i < vetor.length; i++){

          Conta conta = vetor[i];

          if(vetor[i].getNome().equals(dep2)){

          vetor[i].setSaldoAtualizado(valor2);

          conta.saldoBancos();

      }


        }
   }
   }
   else if(option.equals(4)){
   
        Integer deposito = Integer.parseInt(JOptionPane.showInputDialog(
                "Deseja sacar por qual opção: \n"
               +"1 = Numero da conta \n"
               +"2 = Nome da Pessoa \n"));

        if(deposito.equals(1)){
         int dep = Integer.parseInt(JOptionPane.showInputDialog(
                 "Insira o numero da conta que deseja sacar : \n"));

         double valorDep = Double.parseDouble(JOptionPane.showInputDialog(
         "Insira o valor que deseja sacar: \n"));

         for(int i = 0; i < vetor.length;i++){

             Conta conta = vetor[i];

             if(vetor[i].getNumeroCont()== deposito){

             vetor[i].setSaldoAtualizado(valorDep * -1);

             conta.saldoBancos();

             }

        }
       }
       else if(deposito.equals(2)){
       
            String dep2 = JOptionPane.showInputDialog("Insira o nome"
                    + " da pessoa que deseja realizar o saque:\n");
            double valorDep = Double.parseDouble(JOptionPane.showInputDialog(
                    "Insira o valor que deseja sacar:\n"));

            for(int i =0; i < vetor.length;i++ ){

                Conta conta = vetor[i];

                if(vetor[i].getNome().equals(dep2)){

                    vetor[i].setSaldoAtualizado(valorDep * -1);

                    conta.saldoBancos();
                }
           }
       }
       }else if (option.equals(5)){
   
           for(int i = 0; i < vetor.length;i++){
               
               Conta conta = vetor[i];
               
               conta.saldoBancos();
               if(conta.getSaldoBancos() < 0 || conta.getSaldoAtualizado() < 0){
               
                   JOptionPane.showMessageDialog(null,
                           "Contas que possui saldo negativo:\n"
                         + "---------------------------------\n"
                     + "Numero Da Conta: "+vetor[i].getNumeroCont()+"\n"
                     + "Saldos: "+ vetor[i].getSaldo() + "\n"
               + "Saldo Movimentação Bancarias:"+ vetor[i].getSaldoAtualizado()+
                          "\nSaldos Totais: "+ vetor[i].getSaldoBancos()+"\n");
               }
               else{
               JOptionPane.showMessageDialog(null, 
                       "Não existe conta saldo negativo");
               }
           }
        }
       else if(option.equals(6)){
       
       for(int i = 0; i <vetor.length;i++){
           Conta conta = vetor[i];
           inicio+= conta.getSaldoBancos();
       }
       JOptionPane.showMessageDialog(null, 
             "-------------------------\n"
             + "Soma de todos os saldos ´"+ inicio+"\n");
       }
       else if(option.equals(7)){
           JOptionPane.showMessageDialog(null, 
                   "-------------------------------\n"
                 + "Contas Cadastradas\n");
           for(int i = 0;i < vetor.length;i++){
               
               Conta conta = vetor[i];
               JOptionPane.showMessageDialog(null,
                       conta.toString()+"\n");
           
           }
    
        }
      else if(option.equals(0)){
       
           JOptionPane.showMessageDialog(null, "Obrigado"
                   + " por usar o Banco Do Brasil");
       }
  
    }while(!option.equals(0));
  } 
}

