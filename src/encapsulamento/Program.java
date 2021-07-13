package encapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double price = sc.nextDouble();

        ProductConstrutor p = new ProductConstrutor(name,price);

        p.printData();

    }

}
