package hashCodeEequals.application;

import hashCodeEequals.application.entities.Client;

public class Program {
    public static void main(String[] args) {
        String a = "Maria";
        String b = "Maria";
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        String s1 = "teste";
        String s2 = "teste";

        Client c1 = new Client("Maria","maria@gmail.com");
        Client c2 = new Client("Maria","maria@gmail.com");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);//Compara referência de memória e não o conteúdo
        System.out.println(s1 == s2);
    }
}
