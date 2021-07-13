import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int y = 32;
        double x = 10.35784;
        String nome = "Maria";
        System.out.print("Olá mundo!");
        System.out.println("Bom dia");
        System.out.println(y);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        System.out.printf("Resultado = %.4f metros %n", x);
    }
}
