package aulaheredia;

import java.util.Scanner;

public class AulaHeredia {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int Numero = leitor.nextInt();
               
        for (int i = 1; i <= Numero;  i = i + 2){
        System.out.println(i);
        }
        

    }
}