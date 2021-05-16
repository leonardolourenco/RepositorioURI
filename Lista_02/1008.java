package aulaherediateste;

import java.util.Scanner;

public class AulaHerediaTeste {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int Numero_func = leitor.nextInt();
        int Numero_horas = leitor.nextInt();
        float Valor_hora = leitor.nextFloat();
        double salario = (Numero_horas*Valor_hora);
        System.out.println("NUMBER = " + Numero_func);
        System.out.println("SALARY = U$ " + String.format("%.2f", salario));
    }

}