package javaBasico;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAreaTriangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xA,xB,xC,yA,yB,yC;

        System.out.println("Enter the measures of triangle X:");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y:");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC)/ 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC)/ 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.println("Triagle X area: "+ areaX);
        System.out.println("Triagle y area: "+ areaY);

        if(areaX > areaY){
            System.out.println("Maior area é X");
        }else
            System.out.println("Maior area é Y");

        sc.close();

    }
}
