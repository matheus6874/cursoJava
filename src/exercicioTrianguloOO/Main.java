package exercicioTrianguloOO;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the measures of triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();



        System.out.println("Triagle X area: "+ areaX);
        System.out.println("Triagle y area: "+ areaY);

        if(areaX > areaY){
            System.out.println("Maior area é X");
        }else
            System.out.println("Maior area é Y");

        sc.close();



    }
}
