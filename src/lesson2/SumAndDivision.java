package lesson2;

/**
 * Created by vaha on 26.05.2017.
 */
public class SumAndDivision {

    public static void main(String[] args) {

        int summ = 1;

        for (int i = 2; i <=1000 ; i++) {

            summ+=i;
        }

        int div = summ/1234;
        int mod = summ%1234;

        System.out.println(mod>div);



    }
}
