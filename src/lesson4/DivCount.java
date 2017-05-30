package lesson4;

/**
 * Created by vaha on 26.05.2017.
 */
public class DivCount {


    public static int findDivCount(short a, short b, int n){

        int count = 0;




            for (int i = a; i <= b; i++) {
                if (i % n == 0)
                    count++;
            }


        return count;
    }


    public static void main(String[] args) {

        System.out.println(findDivCount((short)1,(short)20,4 ));
    }
}
