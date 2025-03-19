
package senhacomscanner;

import java.util.Scanner;


public class SenhaComScanner {

    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int senha1, senha2, num1, num2;
        System.out.print("Digite sua senha: ");
        senha1 = leia.nextInt();
        System.out.print("Digite um número: ");
        num1 = leia.nextInt();
        System.out.print("Digite um segundo número: ");
        num2 = leia.nextInt();
        System.out.print("Digite a senha novamente para acessar o resultado: ");
        senha2 = leia.nextInt();
        if (senha2 == senha1) {
            System.out.print("A soma dos numeros é: " +(num1 + num2));
        }
        else {
            System.out.print("Senha incorreta!");
        }
        
    }
    
}
