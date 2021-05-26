package aulaheredia;

import java.util.Scanner;

public class AulaHeredia {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int Contador = 0;
        for (int i=0; i < 6; i++) {
        	double Numero = leitor.nextDouble();
        	if (Numero > 0) Contador++;
        }
        System.out.println(Contador + " valores positivos");
       
}
}