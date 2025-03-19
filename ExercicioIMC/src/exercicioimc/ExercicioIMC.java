package exercicioimc;

import java.util.Scanner;

public class ExercicioIMC {

    public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);
       float peso, altura, IMC;
        System.out.print("Digite seu peso: ");
        peso = leia.nextFloat();
        System.out.print("Digite sua altura: ");
        altura = leia.nextFloat();
        IMC = peso / (altura * altura);
        System.out.printf("Seu imc = %.2f", IMC, " ");
        if (IMC <20){
            System.out.println("Abaixo do peso");
        }
        else if ((IMC>=20) && (IMC<24)){
            System.out.println("Peso ideal");
    }
        else if ((IMC>=24) && (IMC<29)){
            System.out.println("Acima do peso");
        } 
        else if ((IMC>=29) && (IMC<34)){
            System.out.println("Obeso");
    }
        else {
            System.out.println("Obeso mórbido");
        }
    }
    
}
