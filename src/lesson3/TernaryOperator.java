package lesson3;

/**
 * Created by vaha on 26.05.2017.
 */
public class TernaryOperator {

    public static void main(String[] args) {

        int summ=0;
        for (int i = 0; i <=1000 ; i++) {
            if(i%2!=0){
                summ+=i;
                System.out.println("Found");
            }

        }


        if ( summ*5 > 5000) System.out.println("Bigger");
        else if (summ*5<5000) System.out.println("Smaller");
        else System.out.println("equal");




    }

}
