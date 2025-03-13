
package treinandoaula2parte3;

import java.util.Scanner;


public class TreinandoAula2Parte3 {

    
    public static void main(String[] args) {
        float nota1, nota2, nota3, media;
        Scanner leia = new Scanner(System.in);
        System.out.print("Primeira nota: ");
        nota1 = leia.nextFloat();
        System.out.print("Segunda nota: ");
        nota2 = leia.nextFloat();
        System.out.print("Terceira nota: ");
        nota3 = leia.nextFloat();
        media = (nota1+nota2+nota3) / 3;
        System.out.print("Média dos valores" + " " + media + " ");
        if (media >= 6){
            System.out.println("Aluno Aprovado");
        }
        else {
            System.out.println("Aluno Reprovado");
        }
    }
    
}
