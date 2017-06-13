package lesson10.abstractbigexample;

/**
 * Created by vaha on 10.06.2017.
 */
public abstract class Employee {
    private String name;
    private int age;
    private int yearsOfExperience;
    private String curPosition;
    private  int salaryPerMonth;

    private BankAccount bankAccount;

    private Company[] companiesWorked = new Company[10];
    private String [] positionWorked = new String[10];

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public String getName() {
        return name;
    }

    abstract void paySalary();




    void changePosition(String newPosition){



        savePositionToHistory();
        curPosition = newPosition;
    }


    private void savePositionToHistory(){
        int index = 0;
        for(String pos : positionWorked){
            if(pos == null){
                positionWorked[index] = curPosition;
                break;
            }
            index ++;
        }
    }




    int getBalance(){

        return bankAccount.getBalance();
    }




}
