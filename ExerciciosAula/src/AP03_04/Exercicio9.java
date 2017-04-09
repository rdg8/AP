/*
 * 9- Crie um programa para validar CPF (o usuário informa os onze dígitos do documento
e ele informa se o número informado é válido ou não). Um CPF é composto de 11
dígitos, em que os dois últimos são os dígitos verificadores. Para ser válido, o primeiro
e o segundo dígitos do CPF informado devem ser iguais a determinados valores, como
descrito abaixo
 */
package AP03_04;

import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        
        int n9 = 0,M1,M2,M3,M4,M5,M6,M7,M8,M9,M10,RestoM,SomaM,SubtracaoM;
  
        System.out.print("Escreva o 1º número do CPF: ");
        int n1 = console.nextInt();
        System.out.print("Escreva o 2º número do CPF: ");
        int n2 = console.nextInt();
        System.out.print("Escreva o 3º número do CPF: ");
        int n3 = console.nextInt();
        System.out.print("Escreva o 4º número do CPF: ");
        int n4 = console.nextInt();
        System.out.print("Escreva o 5º número do CPF: ");
        int n5 = console.nextInt();
        System.out.print("Escreva o 6º número do CPF: ");
        int n6 = console.nextInt();
        System.out.print("Escreva o 7º número do CPF: ");
        int n7 = console.nextInt();
        System.out.print("Escreva o 8º número do CPF: ");
        int n8 = console.nextInt();
        System.out.print("Escreva o 9º número do CPF: ");
        n9 = console.nextInt();
        System.out.print("Escreva o 10º número do CPF: ");
        int n10 = console.nextInt();
        System.out.print("Escreva o 11º número do CPF: ");
        int n11 = console.nextInt();
        
        
        //passo 1
        int m1=n1*10;
        int m2=n2*9;
        int m3=n3*8;
        int m4=n4*7;
        int m5=n5*6;
        int m6=n6*5;
        int m7=n7*4;
        int m8=n8*3;
        int m9=n9*2;
        
        //soma
        int somaM = m1+m2+m3+m4+m5+m6+m7+m8+m9;
        System.out.println("Soma M="+ somaM);
        //resto divisao
        int restoM = somaM % 11;
        System.out.println("Resto M="+ restoM);
        //Subtracao do resto 
        int subtracaoM = 11 - restoM;
        System.out.println("subtracao M="+ subtracaoM);
        
        //passo 6
                        M1 = n1*11;
                        M2 = n2*10;
                        M3 = n3*9;
                        M4 = n4*8;
                        M5 = n5*7;
                        M6 = n6*6;
                        M7 = n7*5;
                        M8 = n8*4;
                        M9 = n9*3;
                        M10= n10*2;
                        
                        SomaM = M1+M2+M3+M4+M5+M6+M7+M8+M9+M10;
                        System.out.println("SomaM="+ SomaM);
                        RestoM = SomaM % 11;
                        System.out.println("RestoM= "+ RestoM);
                        SubtracaoM = 11 - RestoM;  
                        System.out.println("SubtracaoM= "+ SubtracaoM);
        
        //PASSO5
        if (subtracaoM<10){
                        
            if (subtracaoM==n10){
                
                //passo 10
                if (SubtracaoM<10){
                    if(SubtracaoM==n11){
                       System.out.println("CPF Valido");
                    }
                }
                else{
                    switch (SubtracaoM){
                        case 10:
                        case 0:
                            System.out.println("CPF Valido");
                            break;
                        default:
                            System.out.println("CPF InValido");
                    }
                }
                                                                  
            }
            else{
                switch (subtracaoM){
                    case 10:
                    case 0:
                        if (SubtracaoM<10){
                            if (SubtracaoM==n11){
                              System.out.println("CPF Valido");  
                            }
                            break;
                        }
                        else{
                            switch (SubtracaoM){
                                case 10:
                                case 0:
                                    System.out.println("CPF Valido");
                                    break;
                                default:
                                    System.out.println("CPF InValido");
                            }
                        }
                        
                        
                    default:
                        System.out.println("CPF InValido");
                } 
                
            
           
            }

        }
        else{
            System.out.println("CPF Invalido");
        }
        
        
        
        
        
        
    }
        
}

    

