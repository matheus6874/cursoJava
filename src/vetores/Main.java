package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vet = new Product[n];

        for (int i=0;i<n;i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vet[i] = new Product(name,price);
        }

        double sum = 0.0;
        for (int i=0;i<n;i++){
            sum += vet[i].getPrice();
        }

        double avg = sum / vet.length;

        System.out.println("Avg:" + avg);

        sc.close();

    }
}
