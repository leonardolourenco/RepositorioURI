package aulaheredia;

import java.util.Scanner;

public class AulaHeredia {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int Contador = 1;
	for (int i = 0; i < N; i++) {
        for (int Num_linha = 0; Num_linha < 3; Num_linha++) {
	System.out.print(Contador + " ");
	Contador++;
	}
	System.out.println("PUM");
        Contador++;       
        }
   }
}