package metodosEstaticos;

import util.Calculate;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculate.circumference(radius);
        double v = Calculate.volume(radius);

        System.out.println("Circumference: " + c);
        System.out.println("Volume: " + v);
        System.out.println("PI value: " + Calculate.PI);
    }

}
