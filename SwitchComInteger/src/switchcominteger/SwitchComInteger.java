
package switchcominteger;

import javax.swing.JOptionPane;


public class SwitchComInteger {

   
    public static void main(String[] args) {
        int x = 0;
        x = Integer.parseInt(JOptionPane.showInputDialog ("Digite um número: "));
        //pode usar isso ao invés do scanner
        switch(x) {
            case 1:
                JOptionPane.showMessageDialog(null, "Você digitou 1");
               //System.out.println("Digitou 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Você digitou 2");
                //System.out.println("Digitou 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Você digitou 3");
                //System.out.println("Digitou 3"); Ao invés do print pode usar o null
                break;
            default:
                JOptionPane.showMessageDialog(null, "Você não digitou nem 1, nem 2 e nem 3.");
                //System.out.println("Não digitou nem 1, nem 2 e nem 3");
        }
    }
    
}
