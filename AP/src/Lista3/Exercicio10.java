/*
 * Faça uma função que recebe a idade de um nadador por parâmetro e retorna , também por parâmetro, a
categoria desse nadador (tipo String) de acordo com a tabela abaixo:
 */
package Lista3;

import java.util.Scanner;


public class Exercicio10 {
    static Scanner input = new Scanner(System.in);
    
    static int entrada(){
        System.out.print("Idade: ");
        int idade = input.nextInt();
        return idade;
    }
    static String categoria(int idade){
        String categoria="";
        if((idade>=5)&(idade<=7)){
            categoria="Infantil A";
        }
        else if((idade>=8)&(idade<=10)){
            categoria="Infantil B";
        }
        else if((idade>=11)&(idade<=13)){
            categoria="Juvenil A";
        }
        else if((idade>=14)&(idade<=17)){
            categoria="Juvenil B";
        }
        else if(idade>=18){
            categoria="Adulto";
        }
        else{
            categoria="Não tem categoria para menores de 5 anos";
        }
        return categoria;
    }
    static void imprimir(String categoria){
        System.out.println(categoria);
    }
    
    public static void main(String[] args) {
        int idade=entrada();
        String categoria=categoria(idade);
        imprimir(categoria);
    }
    
}
