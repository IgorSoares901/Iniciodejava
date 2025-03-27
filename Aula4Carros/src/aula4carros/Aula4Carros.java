
package aula4carros;

import java.util.Scanner;


public class Aula4Carros {

  
    public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);
       int ano, contaCarros = 0, contaCarrosAte2000 = 0;
       float valorVeiculo = 0, mediaAte2000 = 0;
       float desconto = 0, valorFinalVeiculo = 0, mediaDeTodosOsCarros = 0;
       String resposta;
       do {
           System.out.print("Digite o valor do veiculo: ");
           valorVeiculo = leia.nextFloat();
           System.out.print("Digite o ano do veiculo: ");
           ano = leia.nextInt();
           if (ano <= 2000){
               desconto = valorVeiculo * 12 / 100;
               valorFinalVeiculo = valorVeiculo - desconto;
               contaCarros++;
               contaCarrosAte2000++;
               mediaAte2000 = mediaAte2000 + valorFinalVeiculo;
               mediaDeTodosOsCarros = mediaDeTodosOsCarros + valorFinalVeiculo;
           }
           else {
               desconto = valorVeiculo * 7 / 100;
               valorFinalVeiculo = valorVeiculo - desconto;
               contaCarros++;
               mediaDeTodosOsCarros = mediaDeTodosOsCarros + valorFinalVeiculo;
           }
           System.out.println("Valor do desconto: " + desconto);
           System.out.println("Valor final do veiculo: " + valorFinalVeiculo);
           System.out.println("Deseja fazer outro calculo de desconto? (S ou N)");
           resposta = leia.next();
           
       } while(resposta.equals("S") || (resposta.equals("s")));
        System.out.println("Total de carros: " + contaCarros);
        System.out.println("Total de carros ate 2000: " + contaCarrosAte2000);
        mediaAte2000 = mediaAte2000 / contaCarrosAte2000;
        System.out.println("Media do valor dos carros ate 2000: " + mediaAte2000);
        mediaDeTodosOsCarros = mediaDeTodosOsCarros / contaCarros;
        System.out.println("Media de todos os carros" + mediaDeTodosOsCarros);
    }
    
}
