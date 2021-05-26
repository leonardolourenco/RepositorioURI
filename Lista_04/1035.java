package aulaheredia;

import java.util.Scanner;

public class AulaHeredia {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();
        int D = leitor.nextInt();
      
        if (B > C && D > A && C > 0 && D > 0 && (C + D) > (A + B) && A % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

    }

}