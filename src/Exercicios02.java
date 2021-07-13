import java.util.Scanner;

public class Exercicios02 {
    public static void main(String[] args) {
        double raio;
        double pi = 3.14159;

        Scanner sc = new Scanner(System.in);

        raio = sc.nextDouble();

        System.out.println("A = " + (pi)*(raio * raio));

    }

}
