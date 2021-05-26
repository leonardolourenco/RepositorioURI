package aulaheredia;

import java.util.Scanner;

public class AulaHeredia {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int Codigo = leitor.nextInt();
        int Quantidade = leitor.nextInt();
        
        if (Codigo == 1){
            System.out.println("Total: R$ " + String.format("%.2f", Quantidade* 4.00));
        }
        if (Codigo == 2){
            System.out.println("Total: R$ " + String.format("%.2f", Quantidade* 4.50));
        }
        if (Codigo == 3){
            System.out.println("Total: R$ " + String.format("%.2f", Quantidade* 5.00));
        }
        if (Codigo == 4){
            System.out.println("Total: R$ " + String.format("%.2f", Quantidade* 2.00));
        }
        if (Codigo == 5){
            System.out.println("Total: R$ " + String.format("%.2f", Quantidade* 1.50));
        }
    }
}