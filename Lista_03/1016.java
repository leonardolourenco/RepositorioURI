package aulaherediateste;

import java.util.Scanner;

public class AulaHerediaTeste {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int KM = leitor.nextInt();
        int X = 60;
        int Y = 90;
        double Tempo = KM /((90 / 60.0) - (60 / 60.0));
        System.out.println(String.format("%.0f", Tempo) + " minutos");
    }

}