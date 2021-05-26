package aulaheredia;

import java.util.Scanner;

public class AulaHeredia {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String Palavra_1 = leitor.next();
        String Palavra_2 = leitor.next();
        String Palavra_3 = leitor.next();
        
   if (Palavra_1.equals("vertebrado")  && Palavra_2.equals("ave") && Palavra_3.equals("carnivoro")) {
   System.out.print("aguia");
  }
  if (Palavra_1.equals("vertebrado") && Palavra_2.equals("ave") && Palavra_3.equals("onivoro")) {
   System.out.print("pomba");
  }
  if (Palavra_1.equals("vertebrado") && Palavra_2.equals("mamifero") && Palavra_3.equals("onivoro")) {
   System.out.print("homem");
  }
  if (Palavra_1.equals("vertebrado") && Palavra_2.equals("mamifero") && Palavra_3.equals("herbivoro")) {
   System.out.print("vaca");
  }  
  if (Palavra_1.equals("invertebrado") && Palavra_2.equals("inseto") && Palavra_3.equals("hematofago")) {
   System.out.print("pulga");
  }
  if (Palavra_1.equals("invertebrado") && Palavra_2.equals("inseto") && Palavra_3.equals("herbivoro")) {
   System.out.print("lagarta");
  }
  if (Palavra_1.equals("invertebrado") && Palavra_2.equals("anelideo") && Palavra_3.equals("hematofago")) {
   System.out.print("sanguessuga");
  }
  if (Palavra_1.equals("invertebrado") && Palavra_2.equals("anelideo") && Palavra_3.equals("onivoro")) {
   System.out.print("minhoca");
  }

    }

}