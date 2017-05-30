package lesson2;

/**
 * Created by vaha on 26.05.2017.
 */
public class SumOfNumbers {

    public static void main(String[] args) {

        long summ=0;

        for (int i = 1; i <=10000000 ; i++) {
            summ+=i;

        }

        System.out.println(summ);



    }
}
