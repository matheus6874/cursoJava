package exercicioPolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employess: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i=1;i<=n;i++){
            System.out.print("Employee #"+i+" data: ");
            System.out.print("Outsourced(y/n): ");
            char ch = sc.nextLine().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            sc.nextLine();
            if(ch == 'y') {
                System.out.println("Additional charge: ");
                double addCharge = sc.nextDouble();
                sc.nextLine();
                Employee emp = new OutsourcedEmployee(name,hours,valuePerHour,addCharge);
                list.add(emp);
            }else{
                Employee emp = new Employee(name,hours,valuePerHour);
                list.add(emp);
            }
        }

        System.out.println();
        System.out.println("PAYMENTS");
        for(Employee emp : list){
            System.out.println(emp.getName() + " $" + emp.payment());

        }

        sc.close();
    }
}
