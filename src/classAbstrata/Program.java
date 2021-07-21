package classAbstrata;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Account> list = new ArrayList<>();
        list.add(new SavingsAccount(1001,"Alex",500.00,0.01));
        list.add(new BusinessAccount(1002,"Pedro",1000.00,400.00));
        list.add(new BusinessAccount(1003,"Maria",2000.00,500.00));
        list.add(new BusinessAccount(1004,"Ana",2000.00,500.00));

        double soma = 0.0;
        for (Account acc : list){
            soma = soma + acc.getBalance();
        }
        System.out.println("Total Balance: "+soma);

        for (Account acc : list){
            acc.deposit(10.0);
        }

        for (Account acc : list){
            System.out.println("Update balance for account "+acc.getBalance()+" "+acc.getNumber());
        }

    }

}
