package aulaherediateste;

import java.util.Scanner;

public class AulaHerediaTeste {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();
        int maiorAB = (A + B + Math.abs(A-B))/2;
        int maiorBC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;
        if (maiorAB > maiorBC){  
        System.out.println(maiorAB+ " eh o maior");
    }
        else {
        System.out.println(maiorBC + " eh o maior");
                }       
    
    }

}