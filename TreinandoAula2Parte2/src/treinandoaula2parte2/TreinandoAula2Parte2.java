
package treinandoaula2parte2;

import java.util.Scanner;


public class TreinandoAula2Parte2 {

    
    public static void main(String[] args) {
       String nome, sobrenome, nomeesobrenome;
       Scanner leia = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = leia.nextLine();
        System.out.print("Digite seu sobrenome: ");
        sobrenome = leia.nextLine();
        nomeesobrenome = (nome + " " + sobrenome);
        System.out.print("Nome e Sobrenome " + " " + nomeesobrenome + " ");
        
        
    }
    
}
