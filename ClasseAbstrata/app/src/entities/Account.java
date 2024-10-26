package entities;

public abstract class Account {
    private Integer number;
    private String titular;
    protected Double saldo;
    
    public Account(){};

    public Account(Integer number, String titular, Double balance){
        this.number = number;
        this.titular = titular;
        this.saldo = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getBalance() {
        return saldo;
    }

    public void saque(double amount){
        saldo -=amount + 5.0;
    }
    public void deposito (double amount){
        saldo += amount;
    }

    

    

}
