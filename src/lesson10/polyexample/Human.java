package lesson10.polyexample;

/**
 * Created by vaha on 10.06.2017.
 */
public class Human {
    private  String name;

    public Human(String name) {
        this.name = name;
    }

    void run (){
        System.out.println("Human class is called...");
        System.out.println(name + " is running");

    }
}
