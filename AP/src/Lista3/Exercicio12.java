/*
 * Faça uma função que recebe, por parâmetro, a altura (alt) e o sexo de uma
pessoa, e retorna o seu peso ideal. Para homens, você calcular o peso ideal 
usando a fórmula: P = 72,7 * altura - 58. 
Para mulheres, utilize a fórmula: P = 62,1 * altura – 44,7
 */
package Lista3;

import java.util.Scanner;


public class Exercicio12 {
    static Scanner input = new Scanner(System.in);
    static double altura(){
        double altura=input.nextDouble();
        return altura;
    }
    static String sexo(){
        String sexo = input.next();
        sexo=sexo.toUpperCase();
        return sexo;
    }
    static double pesoideal(double altura, String sexo){
        double ideal=0;
        switch(sexo){
            case "HOMEM":
            case "MASCULINO":
                ideal=(72.7 * altura)-58;
                break;
            case "FEMININO":
            case "MULHER":
                ideal=(62.1 * altura)-44.7;
                break;
        }
        return ideal;
    }
    static void imprimir(double pesoideal){
        System.out.println("Peso ideal: "+pesoideal);
    }
    
    public static void main(String[] args) {
        System.out.print("Sexo: ");
        String sexo=sexo();
        System.out.print("Altura em metros: ");
        double altura=altura();
        double ideal=pesoideal(altura, sexo);
        imprimir(ideal);
    }
    
}
