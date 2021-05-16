package aulaherediateste;

import java.util.Scanner;

public class AulaHerediaTeste {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double media = (A*2 + B*3 + C*5)/10;
        System.out.println("MEDIA = " + String.format("%.1f",media));
    }

}