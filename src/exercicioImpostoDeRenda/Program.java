package exercicioImpostoDeRenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Contribuintes> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int numeroContribuites = sc.nextInt();
        sc.nextLine();
        for (int i=1;i<=numeroContribuites;i++){
            System.out.println("Tax payer #"+i+" data:");
            System.out.print("Individual or company (i/c): ");
            char t = sc.nextLine().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double income = sc.nextDouble();
            if (t == 'i'){
                System.out.print("Health expenditures: ");
                double expenditures = sc.nextDouble();
                sc.nextLine();
                list.add(new ContribuintesPf(name,income,expenditures));
            }else{
                System.out.print("Number of employees: ");
                int n = sc.nextInt();
                sc.nextLine();
                list.add(new ContribuintesPj(name,income,n));
            }
        }
        System.out.println("Taxes PAID: ");
        double soma = 0;
        for (Contribuintes x : list){
            System.out.println(x.getNome()+": "+ x.calculIamposto());
            soma = soma + x.calculIamposto();
        }
        System.out.println();
        System.out.println("Total Taxes: " + soma);

    }

}
