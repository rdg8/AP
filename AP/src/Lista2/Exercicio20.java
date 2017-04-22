/*
 *20-Escreva um programa capaz de ler o saldo inicial de uma conta bancária e um 
 * número indeterminado de operações de depósito e saque.
 * O usuário deve digitar “1” para realizar um depósito, “2” para realizar um saque.
 * Após digitar o código da operação, o usuário deve digitar o valor. 
 * As operações devem continuar sendo realizadas até que o usuário digite o 
 * código de operação “3”. Ao digitar “3”, o programa deve ser encerrado e o 
 * saldo final da conta deve ser impresso com as seguintes mensagens: 
 * CONTA ZERADA (caso o saldo final seja 0), CONTA ESTOURADA (se o saldo for negativo) 
 * ou CONTA PREFERENCIAL (se o saldo for positivo).
 * Utilize o laço DO-WHILE.
 */
package Lista2;

import java.util.Scanner;


public class Exercicio20 {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        
        System.out.print("Digite o Saldo: R$");
        double saldo=console.nextDouble();
        
        System.out.println("*1 para realizar depositos \n*2 para realizar saques"
                     +"\n*3 para finalizar");
        int op;
        
        do{
            System.out.print("\nDIGITE uma operação:");
            op=console.nextInt();
            
            
            while((op!=1)&(op!=2)&(op!=3)){
                System.err.println("Operação INVALIDA");
                
                  System.out.println("*1 para realizar depositos \n*2 para realizar saques"
                     +"\n*3 para finalizar");
            op=console.nextInt();
            }
            
            switch(op){
                case 1:
                    System.out.println("Digite valor a ser depositado");
                    double d=console.nextDouble();
                    saldo=saldo+d;
                    break;
                case 2:
                    System.out.println("Digite valor a ser sacado");
                    double s=console.nextDouble();
                    saldo=saldo-s;
                    break;
                
            }
            
        }while(op!=3);
        
        if(saldo>0){
        System.out.println("CONTA PREFERENCIAL saldo\n R$" +saldo);
        }
        if(saldo==0){
        System.out.println("CONTA ZERADA \nsaldo R$" +saldo);
        }
        if(saldo<0){
        System.out.println("CONTA ESTOURADA \nsaldo R$" +saldo);
        }
        
        
        
    }
    
}
