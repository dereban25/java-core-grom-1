package lesson10.abstractbigexample;

/**
 * Created by vaha on 10.06.2017.
 */
public class BankAccount {

    private Employee employee;
    private int balance;

    public BankAccount(Employee employee) {
        this.employee = employee;
    }


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }



}
