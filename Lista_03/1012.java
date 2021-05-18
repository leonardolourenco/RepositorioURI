package aulaherediateste;

import java.util.Scanner;

public class AulaHerediaTeste {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        
        double triangulo = A * C / 2;
        double circulo = 3.14159 * (C * C);
        double trapezio = ((A + B) * C) / 2;
        double quadrado = B * B;
        double retangulo = (A * B);
       
        System.out.println("TRIANGULO: " + String.format("%.3f" , triangulo));
        System.out.println("CIRCULO: " + String.format("%.3f" , circulo));
        System.out.println("TRAPEZIO: " + String.format("%.3f" , trapezio));
        System.out.println("QUADRADO: " + String.format("%.3f" , quadrado));
        System.out.println("RETANGULO: " + String.format("%.3f" , retangulo));
    
    }

}