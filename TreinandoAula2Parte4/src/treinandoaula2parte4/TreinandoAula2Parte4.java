
package treinandoaula2parte4;

import java.util.Scanner;


public class TreinandoAula2Parte4 {

   
    public static void main(String[] args) {
        int num1;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        num1 = leia.nextInt();
        if (num1 % 2 == 1){
            System.out.println("Número impar");
        }
        else {
            System.out.println("Número par");
        }
    }
    
    
}
