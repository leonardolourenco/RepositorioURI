package aulaherediateste;

import java.util.Scanner;

public class AulaHerediaTeste {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.next();
        double salario = leitor.nextDouble();
        double vendas = leitor.nextDouble();
        double bonus = (vendas * 0.15);
        double total = salario + bonus;
        System.out.println("TOTAL = R$ " + String.format("%.2f", total));
    }

}