
package javaswitch;

import java.util.Scanner;


public class JavaSwitch {

    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int x;
        System.out.print("Digite o número: ");
        x = leia.nextInt();
        switch(x) {
            case 1:
                System.out.println("Digitou 1");
                break;
            case 2:
                System.out.println("Digitou 2");
                break;
            case 3:
                System.out.println("Digitou 3");
                break;
            default: 
                System.out.println("Não digitou nem 1, nem 2 e nem 3");
        }
    }
    
}
