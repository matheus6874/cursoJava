package exercicioExcepetionSaque;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double ammount){
        this.balance = this.balance + ammount;
    }
    public void withdraw(Double ammount){
        if (this.balance <= 0 ){
            throw new RuntimeException("Withdraw error: Insufficient balance");
        }else if(ammount > this.withdrawLimit){
            throw new RuntimeException("Withdraw error: The amount excessds withdraw limit");
        }
        else {
            this.balance = this.balance - ammount;
            System.out.println("New Balance: " + this.balance);
        }
    }

}
