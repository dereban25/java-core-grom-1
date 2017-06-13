package lesson10.abstractbigexample;

/**
 * Created by vaha on 10.06.2017.
 */
public class DeveloperEmployee extends  Employee{
    private  String [] frameworks = new String [10];

    @Override
    void paySalary() {
        int newBalance = getBankAccount().getBalance() + getSalaryPerMonth() + 1000;
        getBankAccount().setBalance(newBalance);
    }
}
