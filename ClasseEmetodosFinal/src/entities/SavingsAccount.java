package entities;

public class  SavingsAccount extends Account{
    private Double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String titular, Double balance, Double interestRate) {
        super(number, titular, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
    
    
    public void updateBalance(){
        saldo += saldo*interestRate;
    }

    @Override
    public final void saque(double amount){
        saldo -=amount ;
    }
}
