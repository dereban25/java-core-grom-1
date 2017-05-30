package lesson5;

/**
 * Created by vaha on 29.05.2017.
 */
public class BankSystemwithdraw {


    /*Вернемся к примеру с клиентами и счетами. Напишите метод, который будет снимать деньги со счета определенного клиента и возвращать остаток на счете.
    Если денег на счете недостаточно метод будет возвращать -1 Сигнатура метода - withdraw(String[] clients, int[] balances, String client, int amount) Метод должен содержаться в классе.
     Название класса не важно
     */


    public  static  int withdraw(String[] clients, int[] balances, String client, int amount){

        int clientIndex= 0;
        for (String cl:clients    ) {
            if(cl==client){
                break;
            }
            clientIndex++;
        }

        if(balances[clientIndex]>=amount) {
            balances[clientIndex]-=amount;
            return   balances[clientIndex];

        }


        return  -1;
    }


    public static void main(String[] args) {

        String [] names = {"Jack","Ann","Denis","Andrey","Nikolay","Irina","John"};
        int [] balances = {100,500,8432,-99,12000,-54,0};


        System.out.println(withdraw(names,balances,"Ann",500));

    }
}
