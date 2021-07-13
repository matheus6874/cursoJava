package ExercicioEstoqueOO;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product p = new Product();
        System.out.println("Enter product data");
        System.out.print("Name: ");
        p.name = sc.nextLine();
        System.out.print("Price: ");
        p.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        p.quantity = sc.nextInt();

        System.out.println("Product data: "+p);

        System.out.print("Enter the number of products to be added in stock:");
        int a = sc.nextInt();
        p.addProducts(a);

        System.out.println("Update product data: "+p);

        System.out.print("Enter the number of products to be removed in stock:");
        a = sc.nextInt();
        p.removeProducts(a);

        System.out.println("Update product data: "+p);

        sc.close();

    }
}
