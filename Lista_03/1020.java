package aulaherediateste;

import java.util.Scanner;

public class AulaHerediaTeste {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int Anos = N/365;
        int Meses = N%365;
        int Dias = Meses%30;
        Meses = Meses/30;
        System.out.println(Anos + " ano(s)\n" + Meses + " mes(es)\n" + Dias + " dia(s)");
        
    }
}