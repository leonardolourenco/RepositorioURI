package aulaherediateste;

import java.util.Scanner;

public class AulaHerediaTeste {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double X1 = leitor.nextDouble();
        double Y1 = leitor.nextDouble();
        double X2 = leitor.nextDouble();
        double Y2 = leitor.nextDouble();
        double Formula = ((X2 - X1) * (X2 - X1)) +((Y2 - Y1) * (Y2 - Y1));
        double Raiz =  Math.sqrt(Formula);
        System.out.println(String.format("%.4f", Raiz));
    }

}