package aulaherediateste;

import java.util.Scanner;

public class AulaHerediaTeste {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int Tempo = leitor.nextInt();
        int Velocidade = leitor.nextInt();
        double Km_Litro = 12;
        double Litro_total = (Tempo * Velocidade / Km_Litro);
        System.out.println(String.format("%.3f", Litro_total));
    }

}