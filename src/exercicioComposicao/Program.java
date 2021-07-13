package exercicioComposicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Product p = new Product("TV",1000.0);
        OrderItem oi1 = new OrderItem(1,1000.0,p);
/*
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYY): ");
        Date birthDate = sdf.parse(sc.next());
        System.out.println("Enter order data:");
        Client client = new Client(name,email,birthDate);

        System.out.print("Status: ");
        String status = sc.nextLine();
        Date dataAtual = new Date();
        Order order = new Order(dataAtual,OrderStatus.valueOf(status));

        System.out.print("How many items to this order? ");
        int qtdItems = sc.nextInt();

        for (int i = 1; i<=qtdItems;i++){
            System.out.println("Enter #"+i+" item data: ");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int qtd = sc.nextInt();
            //OrderItem orderItem = new OrderItem(productName,qtd,productPrice);
          //  order.addItem(orderItem);
        }

        System.out.println("ORDER SUMMARY:");
        System.out.println(order);
        System.out.println(client);
        System.out.println("Order items");


        sc.close();

 */
    }
}
