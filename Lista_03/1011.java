package aulaherediateste;

import java.util.Scanner;

public class AulaHerediaTeste {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double raio = leitor.nextDouble();
        double raio_cubo = raio * raio * raio;
        double pi = 3.14159;
        double volume = (4/3.0) * (pi * raio_cubo);
        System.out.println("VOLUME = " + String.format("%.3f" , volume));
    }

}