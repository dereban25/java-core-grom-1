package lesson10.abstractfirstexample;

/**
 * Created by vaha on 10.06.2017.
 */
public abstract class DbProvider {
    private  String dbHost;

    abstract  void connectToDb();
    abstract void disconnectFromDb();

    void printDbHost(){
        System.out.println("DB host is" + dbHost);
    }
}
