package lesson10.abstractbigexample;

/**
 * Created by vaha on 10.06.2017.
 */
public class ManagerEmployee extends  Employee {

    @Override
    void paySalary() {
        int newBalance = getBankAccount().getBalance() + getSalaryPerMonth() ;
        newBalance += newBalance * 0.25;
        getBankAccount().setBalance(newBalance);
    }
}
