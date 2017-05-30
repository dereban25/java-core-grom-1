package lesson2;

/**
 * Created by vaha on 26.05.2017.
 */
public class BreakContinueExample {

    //123
    public static void main(String[] args) {

        int test = 10;

        //break example
        /*while (test >0){
            System.out.println(test);
            System.out.println("...");
            test--;
        }*/




        //continue example
        while (test >0){
            System.out.println(test);
            if(test==5)
                continue;
            System.out.println("...");
            test--;
        }

        System.out.println("done");
    }

}
