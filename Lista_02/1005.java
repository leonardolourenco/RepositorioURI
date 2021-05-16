package aulaherediateste;

import java.util.Scanner;

public class AulaHerediaTeste {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double media = (A*3.5 + B*7.5)/11;
        System.out.println("MEDIA = " + String.format("%.5f",media));
    }

}