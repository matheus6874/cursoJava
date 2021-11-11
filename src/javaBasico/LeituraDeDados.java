package javaBasico;

import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x,frase;
        int y;
        double numero;
        char caracter;
        System.out.print("Digite um nome:");
        x = sc.next();
        System.out.println("Voce digitou " + x);

        System.out.print("Digite um numero:");
        y = sc.nextInt();
        System.out.println("Voce digitou o numero " + y);

        System.out.print("Digite um numero decimal:");
        numero = sc.nextDouble();
        System.out.println("Voce digitou o numero decimal "+ numero);

        System.out.print("Ditite um caracter:");
        caracter = sc.next().charAt(0);
        System.out.println("Voce digitou o caracater: "+ caracter);

        sc.close();
    }

}
