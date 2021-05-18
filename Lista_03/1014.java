package aulaherediateste;

import java.util.Scanner;

public class AulaHerediaTeste {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float X = leitor.nextFloat();
        float Y = leitor.nextFloat();
        float Total = X / Y;
        System.out.println(String.format("%.3f", Total )+ " km/l");
    }

}