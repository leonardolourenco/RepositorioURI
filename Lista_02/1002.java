package aulaherediateste;

import java.util.Scanner;

public class AulaHerediaTeste {

    public static void main(String[] args) {
        double N = 3.14159;
        double Raio;
        double Area;
        Scanner ler = new Scanner(System.in);
        Raio = ler.nextDouble();
        Area = N * (Raio * Raio);
        System.out.println("A=" + String.format("%.4f", Area));
    }

}