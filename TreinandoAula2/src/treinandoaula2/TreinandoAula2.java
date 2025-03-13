
package treinandoaula2;

import java.util.Scanner;


public class TreinandoAula2 {

    
    public static void main(String[] args) {
       float num1, num2, num3, media;
       Scanner leia = new Scanner(System.in);
        System.out.print("Digite o Número 1: ");
        num1 = leia.nextFloat();
        System.out.print("Digite o Número 2: ");
        num2 = leia.nextFloat();
        System.out.print("Digite o Número 3: ");
        num3 = leia.nextFloat();
        media = (num1+num2+num3) / 3;
        System.out.print("Média dos valores:" + " " + media + " ");
               
       
    }
    
}
