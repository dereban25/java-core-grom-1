package lesson10.polyexample;

/**
 * Created by vaha on 10.06.2017.
 */
public class User extends Human {

    public User(String name) {
        super(name);
    }

    @Override
    void run() {
        System.out.println("User class is called...");
        super.run();
    }
}
