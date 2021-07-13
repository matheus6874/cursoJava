package exercicioBanco;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int conta;
        String nome;
        char opcao;
        Conta c;

        System.out.print("Enter account number: ");
        conta = sc.nextInt();
        String cache = sc.nextLine();

        System.out.print("Enter account holder: ");
        nome = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)?: ");
        opcao = sc.next().charAt(0);

        if(opcao == 'y'){
            double valor;
            System.out.print("Enter inicial deposit value: ");
            valor = sc.nextDouble();
            c = new Conta(conta,nome,valor);
        }else{
            c = new Conta(conta,nome);
        }

        c.printData();

        System.out.print("Enter a deposit value: ");
        double valor = sc.nextDouble();
        c.depositar(valor);
        c.printData();

        System.out.print("Enter withdraw value: ");
        valor = sc.nextDouble();
        c.sacar(valor);
        c.printData();

        sc.close();
    }
}
