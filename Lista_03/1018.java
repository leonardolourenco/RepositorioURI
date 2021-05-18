package aulaherediateste;

import java.util.Scanner;

public class AulaHerediaTeste {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int Cedula_100 = 100;
        int Cedula_50 = 50;
        int Cedula_20 = 20;
        int Cedula_10 = 10;
        int Cedula_5 = 5;
        int Cedula_2 = 2;
        int Cedula_1 = 1;
        System.out.println(N);
        if (N >= 100 && N <= 1000000) {
            if (Cedula_100 > 0) {
                Cedula_100 = N / 100;
                N = N % 100;
                System.out.println(Cedula_100 + " nota(s) de 100");
            }
            if (Cedula_50 > 0) {
                Cedula_50 = N / 50;
                N = N % 50;
                System.out.println(Cedula_50 + " nota(s) de 50");
            }
            if (Cedula_20 > 0) {
                Cedula_20 = N / 20;
                N = N % 20;
                System.out.println(Cedula_20 + " nota(s) de 20");
            }
            if (Cedula_10 > 0) {
                Cedula_10 = N / 10;
                N = N % 10;
                System.out.println(Cedula_10 + " nota(s) de 10");
            }
            if (Cedula_5 > 0) {
                Cedula_5 = N / 5;
                N = N % 5;
                System.out.println(Cedula_5 + " nota(s) de 5");
            }
            if (Cedula_2 > 0){
                Cedula_2 = N / 2;
                N = N % 2;
                System.out.println(Cedula_2 + " nota(s) de 2");
            }
            if (Cedula_1 > 0) {
                Cedula_1 = N / 1;
                N = N % 1;
                System.out.println(Cedula_1 + " nota(s) de 1");
            }
        }
    }
}