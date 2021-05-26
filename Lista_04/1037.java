package aulaheredia;

import java.util.Scanner;

public class AulaHeredia {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float Valor = leitor.nextFloat();
        
        if (Valor >= 0 && Valor <= 25){
                System.out.println("Intervalo [0,25]");
    }
        if (Valor > 25 && Valor <= 50){
        System.out.println("Intervalo (25,50]");
    }
        if (Valor > 50 && Valor <= 75){
        System.out.println("Intervalo (50,75]"); 
}
        if (Valor > 75 && Valor <= 100){
        System.out.println("Intervalo (75,100]");
    }
        if(Valor < 0 ||Valor > 100){
            System.out.println("Fora de intervalo");    
                }

}
}