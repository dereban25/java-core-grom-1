package lesson4;

/**
 * Created by vaha on 27.05.2017.
 */
public class SummFind {

    public static boolean compareSums(int a, int b, int c, int d){



        return sum(a,b)>sum(c,d) ? true : false;
    }


    public static long sum(int from, int to){

        long summ=0;
        for (long i = from; i <=to ; i++) {
            summ+=i;
        }

        return summ;

    }

    public static void main(String[] args) {

        System.out.println(compareSums(1,2147483647,5,10));


    }
}
