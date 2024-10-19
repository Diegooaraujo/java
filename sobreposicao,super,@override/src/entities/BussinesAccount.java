package entities;

public class BussinesAccount extends Account {
    private Double loanLimit;

    public BussinesAccount(){};

    public BussinesAccount(Integer number, String titular, Double balance, Double loanLimit) {
        super(number, titular, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    };
    
    public void loan (double amount){
        if(amount <= loanLimit){
            saldo+=amount-10.0;;
        }
    }
    @Override
    public void saque(double amount){
        super.saque(amount);
        saldo -=2.0;
    }
}