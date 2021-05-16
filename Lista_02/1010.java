package aulaherediateste;

import java.util.Scanner;

public class AulaHerediaTeste {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int codigo_1 = leitor.nextInt();
        int quant_1 = leitor.nextInt();
        float valor_1 = leitor.nextFloat();
        int codigo_2 = leitor.nextInt();
        int quant_2 = leitor.nextInt();
        float valor_2 = leitor.nextFloat();
        float valor_total = (quant_1 * valor_1) + (quant_2 * valor_2);
        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", valor_total));
    }

}