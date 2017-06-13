package lesson10.polyexample;

/**
 * Created by vaha on 10.06.2017.
 */
public class Demo {


    private static void run ( Human human){
        human.run();
    }

    public static void main(String[] args) {

        Human human = new Human("Test");

        run(human);
        System.out.println();

        User user = new User("Jack");
        run(user);


    }
}
