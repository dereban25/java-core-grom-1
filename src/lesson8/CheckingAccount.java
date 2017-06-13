package lesson8;

/**
 * Created by vaha on 04.06.2017.
 */
public class CheckingAccount extends Account{
    int limitOFExprenses;

    public CheckingAccount(String bankName, String ownerName, int moneyAmount, int limitOFExprenses) {
        super(bankName, ownerName, moneyAmount);
        this.limitOFExprenses = limitOFExprenses;
    }


    void withdraw(int amount){
        if ( amount > limitOFExprenses){
            return;
        }
        moneyAmount -= amount;
    }



}
