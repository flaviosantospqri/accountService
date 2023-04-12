package entities.models;

public class BusinessAccount extends Account{
    private Double loanLimite;

    public BusinessAccount() {
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimite) {
        super(number, holder, balance);
        this.loanLimite = loanLimite;
    }

    public Double getLoanLimite() {
        return loanLimite;
    }

    public void setLoanLimite(Double loanLimite) {
        this.loanLimite = loanLimite;
    }

    public void loan(double amount){
        if(amount <= loanLimite){
            depoisit(amount);
        }
    }

    @Override
    public void withDraw(Double amount){
        super.withDraw(amount);
        balance -= 2.0;
    }
}


