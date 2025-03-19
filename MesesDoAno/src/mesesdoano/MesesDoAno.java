
package mesesdoano;


public class MesesDoAno {

    
    public static void main(String[] args) {
        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        
        System.out.println("================");
        System.out.println("Mês - Nome do mês");
        System.out.println("================");
        
        for (int i = 1; i <=12; i++){
            System.out.printf("%02d - %s\n", i, meses[i - 1]);
        }
        System.out.println("================");
    }
    
}
