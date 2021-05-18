package aulaherediateste;

import java.util.Scanner;

public class AulaHerediaTeste {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int Horas = N / 3600;
        int Resto_horas = N % 3600;        
        int Minutos = Resto_horas / 60;
        int Resto_minutos = Resto_horas % 60;
        int segundos = Resto_minutos;
        System.out.println(Horas + ":" + Minutos + ":" + segundos);
    }
}