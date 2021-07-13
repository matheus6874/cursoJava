package exercicioBanco;

public class Conta {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public Conta(int numeroConta, String nomeTitular, double saldo){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public Conta(int numeroConta, String nomeTitular){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    public void sacar(double valor){
        this.saldo = this.saldo - valor - 5.00;
    }

    public void printData(){
        System.out.println("Account data:");
        System.out.println("Account " + this.numeroConta + ", Holder: " +this.nomeTitular +
                " Balance $ " + this.saldo);
    }
}
